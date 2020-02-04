/*
 * This file is generated by jOOQ.
 */
package com.springsecurityoauth2.swagger.ui.model;


import com.springsecurityoauth2.swagger.ui.model.tables.OauthAccessToken;
import com.springsecurityoauth2.swagger.ui.model.tables.OauthClientDetails;
import com.springsecurityoauth2.swagger.ui.model.tables.OauthClientToken;
import com.springsecurityoauth2.swagger.ui.model.tables.Permission;
import com.springsecurityoauth2.swagger.ui.model.tables.Role;
import com.springsecurityoauth2.swagger.ui.model.tables.RolePermission;
import com.springsecurityoauth2.swagger.ui.model.tables.User;
import com.springsecurityoauth2.swagger.ui.model.tables.UserRole;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index OAUTH_ACCESS_TOKEN_PKEY = Indexes0.OAUTH_ACCESS_TOKEN_PKEY;
    public static final Index OAUTH_CLIENT_DETAILS_PKEY = Indexes0.OAUTH_CLIENT_DETAILS_PKEY;
    public static final Index OAUTH_CLIENT_TOKEN_PKEY = Indexes0.OAUTH_CLIENT_TOKEN_PKEY;
    public static final Index PERMISSION_NAME_UN = Indexes0.PERMISSION_NAME_UN;
    public static final Index PERMISSION_PKEY = Indexes0.PERMISSION_PKEY;
    public static final Index NAME_UN = Indexes0.NAME_UN;
    public static final Index ROLE_PKEY = Indexes0.ROLE_PKEY;
    public static final Index ROLE_PERMISSION_PKEY = Indexes0.ROLE_PERMISSION_PKEY;
    public static final Index USER_EMAIL_NAME_UN = Indexes0.USER_EMAIL_NAME_UN;
    public static final Index USER_PKEY = Indexes0.USER_PKEY;
    public static final Index USER_ROLE_PKEY = Indexes0.USER_ROLE_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index OAUTH_ACCESS_TOKEN_PKEY = Internal.createIndex("oauth_access_token_pkey", OauthAccessToken.OAUTH_ACCESS_TOKEN, new OrderField[] { OauthAccessToken.OAUTH_ACCESS_TOKEN.AUTHENTICATION_ID }, true);
        public static Index OAUTH_CLIENT_DETAILS_PKEY = Internal.createIndex("oauth_client_details_pkey", OauthClientDetails.OAUTH_CLIENT_DETAILS, new OrderField[] { OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_ID }, true);
        public static Index OAUTH_CLIENT_TOKEN_PKEY = Internal.createIndex("oauth_client_token_pkey", OauthClientToken.OAUTH_CLIENT_TOKEN, new OrderField[] { OauthClientToken.OAUTH_CLIENT_TOKEN.AUTHENTICATION_ID }, true);
        public static Index PERMISSION_NAME_UN = Internal.createIndex("permission_name_un", Permission.PERMISSION, new OrderField[] { Permission.PERMISSION.NAME }, true);
        public static Index PERMISSION_PKEY = Internal.createIndex("permission_pkey", Permission.PERMISSION, new OrderField[] { Permission.PERMISSION.ID }, true);
        public static Index NAME_UN = Internal.createIndex("name_un", Role.ROLE, new OrderField[] { Role.ROLE.NAME }, true);
        public static Index ROLE_PKEY = Internal.createIndex("role_pkey", Role.ROLE, new OrderField[] { Role.ROLE.ID }, true);
        public static Index ROLE_PERMISSION_PKEY = Internal.createIndex("role_permission_pkey", RolePermission.ROLE_PERMISSION, new OrderField[] { RolePermission.ROLE_PERMISSION.ROLE_ID, RolePermission.ROLE_PERMISSION.PERMISSION_ID }, true);
        public static Index USER_EMAIL_NAME_UN = Internal.createIndex("user_email_name_un", User.USER, new OrderField[] { User.USER.USER_NAME, User.USER.EMAIL }, true);
        public static Index USER_PKEY = Internal.createIndex("user_pkey", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER_ROLE_PKEY = Internal.createIndex("user_role_pkey", UserRole.USER_ROLE, new OrderField[] { UserRole.USER_ROLE.USER_ID, UserRole.USER_ROLE.ROLE_ID }, true);
    }
}
