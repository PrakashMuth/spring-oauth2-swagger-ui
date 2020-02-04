package com.springsecurityoauth2.swagger.ui.controllers;

import com.springsecurityoauth2.swagger.ui.security.AuthUserDetails;
import com.springsecurityoauth2.swagger.ui.swagger2.Swagger;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Swagger
public class UserController {

    @GetMapping("/user")
    public AuthUserDetails user(@AuthenticationPrincipal AuthUserDetails authUserDetails) {
        return authUserDetails;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/world")
    public String testWorld() {
        return "World Test";
    }
}
