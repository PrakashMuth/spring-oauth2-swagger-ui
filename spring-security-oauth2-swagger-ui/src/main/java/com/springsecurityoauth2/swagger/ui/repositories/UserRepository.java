package com.springsecurityoauth2.swagger.ui.repositories;

import com.springsecurityoauth2.swagger.ui.model.tables.pojos.Permission;
import com.springsecurityoauth2.swagger.ui.model.tables.pojos.Role;
import com.springsecurityoauth2.swagger.ui.model.tables.pojos.User;
import com.springsecurityoauth2.swagger.ui.model.tables.RolePermission;
import com.springsecurityoauth2.swagger.ui.model.tables.UserRole;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.SelectConditionStep;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.springsecurityoauth2.swagger.ui.model.tables.User.USER;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final DSLContext db;

    public Optional<User> fetchUsernameOrEmail(String usernameOrEmail) {
        return Optional.of(db.selectFrom(USER).where(USER.USER_NAME.eq(usernameOrEmail.trim().toLowerCase()))
                .or(USER.EMAIL.eq(usernameOrEmail.trim().toLowerCase())).fetchOneInto(User.class));
    }

    private SelectConditionStep<Record1<Integer>> getRoleIdsQueryByUserId(Integer userId) {
        return db.select(UserRole.USER_ROLE.ROLE_ID).from(UserRole.USER_ROLE).where(UserRole.USER_ROLE.USER_ID.eq(userId));
    }

    public List<Role> findRolesByUserId(Integer userId) {
        var roleIds = getRoleIdsQueryByUserId(userId);
        return db.select(com.springsecurityoauth2.swagger.ui.model.tables.Role.ROLE.NAME).from(com.springsecurityoauth2.swagger.ui.model.tables.Role.ROLE).where(com.springsecurityoauth2.swagger.ui.model.tables.Role.ROLE.ID.eq(roleIds)).fetchInto(Role.class);
    }

    public List<Permission> findPrivilegesByUserId(Integer userId) {
        var roleIds = getRoleIdsQueryByUserId(userId);
        return db.selectFrom(com.springsecurityoauth2.swagger.ui.model.tables.Permission.PERMISSION).where(com.springsecurityoauth2.swagger.ui.model.tables.Permission.PERMISSION.ID.in(
                db.select(RolePermission.ROLE_PERMISSION.PERMISSION_ID).from(RolePermission.ROLE_PERMISSION)
                        .where(RolePermission.ROLE_PERMISSION.ROLE_ID.in(
                                db.select(com.springsecurityoauth2.swagger.ui.model.tables.Role.ROLE.ID).from(com.springsecurityoauth2.swagger.ui.model.tables.Role.ROLE).where(com.springsecurityoauth2.swagger.ui.model.tables.Role.ROLE.ID.in(roleIds))
                        ))
        )).fetchInto(Permission.class);
    }
}
