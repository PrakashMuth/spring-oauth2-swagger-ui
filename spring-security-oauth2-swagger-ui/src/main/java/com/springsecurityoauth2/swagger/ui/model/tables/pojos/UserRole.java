/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.swagger.ui.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRole implements Serializable {

    private static final long serialVersionUID = -18965352;

    private Integer userId;
    private Integer roleId;

    public UserRole() {}

    public UserRole(UserRole value) {
        this.userId = value.userId;
        this.roleId = value.roleId;
    }

    public UserRole(
        Integer userId,
        Integer roleId
    ) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserRole (");

        sb.append(userId);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}
