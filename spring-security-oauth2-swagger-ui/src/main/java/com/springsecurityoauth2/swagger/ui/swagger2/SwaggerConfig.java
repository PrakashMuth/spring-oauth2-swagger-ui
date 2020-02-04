package com.springsecurityoauth2.swagger.ui.swagger2;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.AuthorizationCodeGrantBuilder;
import springfox.documentation.builders.OAuthBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@RequiredArgsConstructor
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
    private static final String TOKEN_URL = "http://localhost:9091/auth/oauth/token";
    private static final String AUTH_URL = "http://localhost:9091/auth/oauth/authorize";
    private static final String CLIENT_ID = "OauthApp";
    private static final String CLIENT_SECRET = "thisissecret";

    @Bean
    public Docket OrgApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("SwaggerTestApi")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Swagger.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .securitySchemes(Lists.newArrayList(securityScheme()))
                .securityContexts(Collections.singletonList(securityContext()));
    }

    @Bean
    public SecurityConfiguration security() {
        return SecurityConfigurationBuilder.builder()
                .clientId(CLIENT_ID)
                .clientSecret(CLIENT_SECRET)
                .scopeSeparator(" ")
                .useBasicAuthenticationWithAccessCodeGrant(true)
                .build();
    }

    private SecurityScheme securityScheme() {
        GrantType grantType = new AuthorizationCodeGrantBuilder()
                .tokenEndpoint(new TokenEndpoint(TOKEN_URL, "oauth_token"))
                .tokenRequestEndpoint(new TokenRequestEndpoint(AUTH_URL, CLIENT_ID, CLIENT_SECRET))
                .build();
        return new OAuthBuilder().name("spring_oauth")
                .grantTypes(Collections.singletonList(grantType))
                .scopes(Arrays.asList(scopes()))
                .build();
    }

    private AuthorizationScope[] scopes() {
        return new AuthorizationScope[]{
                new AuthorizationScope("webclient", "for read and write operations"),
                new AuthorizationScope("mobileclient", "for read and write operations")};
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(
                        Collections.singletonList(new SecurityReference("spring_oauth", scopes())))
                .forPaths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "SWAGGER UI REST API",
                "Swagger2ui custom description of API.",
                "API TOS",
                "Terms of service",
                new Contact("Bruce_wayne", "www.swagger-ui.com", "bruce_wayne@swagger-ui.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
