/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.swagger.ui.model.tables.daos;


import com.springsecurityoauth2.swagger.ui.model.tables.RolePermission;
import com.springsecurityoauth2.swagger.ui.model.tables.records.RolePermissionRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


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
public class RolePermissionDao extends DAOImpl<RolePermissionRecord, com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission, Record2<Integer, Integer>> {

    /**
     * Create a new RolePermissionDao without any configuration
     */
    public RolePermissionDao() {
        super(RolePermission.ROLE_PERMISSION, com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission.class);
    }

    /**
     * Create a new RolePermissionDao with an attached configuration
     */
    public RolePermissionDao(Configuration configuration) {
        super(RolePermission.ROLE_PERMISSION, com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission.class, configuration);
    }

    @Override
    public Record2<Integer, Integer> getId(com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission object) {
        return compositeKeyRecord(object.getRoleId(), object.getPermissionId());
    }

    /**
     * Fetch records that have <code>role_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission> fetchRangeOfRoleId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(RolePermission.ROLE_PERMISSION.ROLE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission> fetchByRoleId(Integer... values) {
        return fetch(RolePermission.ROLE_PERMISSION.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>permission_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission> fetchRangeOfPermissionId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(RolePermission.ROLE_PERMISSION.PERMISSION_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>permission_id IN (values)</code>
     */
    public List<com.springsecurityoauth2.swagger.ui.model.tables.pojos.RolePermission> fetchByPermissionId(Integer... values) {
        return fetch(RolePermission.ROLE_PERMISSION.PERMISSION_ID, values);
    }
}
