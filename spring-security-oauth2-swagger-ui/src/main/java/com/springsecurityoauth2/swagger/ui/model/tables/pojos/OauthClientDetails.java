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
public class OauthClientDetails implements Serializable {

    private static final long serialVersionUID = -139313920;

    private String  clientId;
    private String  resourceIds;
    private String  clientSecret;
    private String  scope;
    private String  authorizedGrantTypes;
    private String  webServerRedirectUri;
    private String  authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    private String  additionalInformation;
    private String  autoapprove;

    public OauthClientDetails() {}

    public OauthClientDetails(OauthClientDetails value) {
        this.clientId = value.clientId;
        this.resourceIds = value.resourceIds;
        this.clientSecret = value.clientSecret;
        this.scope = value.scope;
        this.authorizedGrantTypes = value.authorizedGrantTypes;
        this.webServerRedirectUri = value.webServerRedirectUri;
        this.authorities = value.authorities;
        this.accessTokenValidity = value.accessTokenValidity;
        this.refreshTokenValidity = value.refreshTokenValidity;
        this.additionalInformation = value.additionalInformation;
        this.autoapprove = value.autoapprove;
    }

    public OauthClientDetails(
        String  clientId,
        String  resourceIds,
        String  clientSecret,
        String  scope,
        String  authorizedGrantTypes,
        String  webServerRedirectUri,
        String  authorities,
        Integer accessTokenValidity,
        Integer refreshTokenValidity,
        String  additionalInformation,
        String  autoapprove
    ) {
        this.clientId = clientId;
        this.resourceIds = resourceIds;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.authorizedGrantTypes = authorizedGrantTypes;
        this.webServerRedirectUri = webServerRedirectUri;
        this.authorities = authorities;
        this.accessTokenValidity = accessTokenValidity;
        this.refreshTokenValidity = refreshTokenValidity;
        this.additionalInformation = additionalInformation;
        this.autoapprove = autoapprove;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getResourceIds() {
        return this.resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAuthorizedGrantTypes() {
        return this.authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public String getWebServerRedirectUri() {
        return this.webServerRedirectUri;
    }

    public void setWebServerRedirectUri(String webServerRedirectUri) {
        this.webServerRedirectUri = webServerRedirectUri;
    }

    public String getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Integer getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getAutoapprove() {
        return this.autoapprove;
    }

    public void setAutoapprove(String autoapprove) {
        this.autoapprove = autoapprove;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OauthClientDetails (");

        sb.append(clientId);
        sb.append(", ").append(resourceIds);
        sb.append(", ").append(clientSecret);
        sb.append(", ").append(scope);
        sb.append(", ").append(authorizedGrantTypes);
        sb.append(", ").append(webServerRedirectUri);
        sb.append(", ").append(authorities);
        sb.append(", ").append(accessTokenValidity);
        sb.append(", ").append(refreshTokenValidity);
        sb.append(", ").append(additionalInformation);
        sb.append(", ").append(autoapprove);

        sb.append(")");
        return sb.toString();
    }
}
