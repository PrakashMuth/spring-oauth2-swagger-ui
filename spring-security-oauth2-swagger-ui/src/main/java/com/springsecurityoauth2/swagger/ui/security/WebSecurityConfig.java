package com.springsecurityoauth2.swagger.ui.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.function.Supplier;
import java.util.stream.Stream;

@Configuration
@Order(1)
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    Supplier<Stream<String>> permitAllPathstream = () -> Stream.of("/login", "/oauth/authorize", "/common/**", "/v2/api-docs/**",
            "/configuration/ui/**", "/swagger-resources/**", "/configuration/security/**", "/swagger-ui.html/**",
            "/webjars/**", "/csrf");

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().antMatchers(permitAllPathstream.get().toArray(String[]::new))
                .and().authorizeRequests()
                .antMatchers(permitAllPathstream.get().toArray(String[]::new)).permitAll()
                .and().authorizeRequests().anyRequest()
                .authenticated().and().formLogin().permitAll();
    }
}
