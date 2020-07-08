package com.example.bootpreparation.controller;

import com.example.bootpreparation.entity.Role;
import com.example.bootpreparation.entity.User;
import com.example.bootpreparation.security.AuthenticationService;
import com.example.bootpreparation.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
@RequestMapping("/registration")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping
    public String registration() {
        return "registration";
    }

    @PostMapping
    public String addUser(User user) {
        authenticationService.register(user);
        return "login";
    }

}
