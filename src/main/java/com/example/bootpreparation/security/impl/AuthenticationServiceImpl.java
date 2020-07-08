package com.example.bootpreparation.security.impl;

import com.example.bootpreparation.entity.Role;
import com.example.bootpreparation.entity.User;
import com.example.bootpreparation.repository.UserRepository;
import com.example.bootpreparation.security.AuthenticationService;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;

    public AuthenticationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        user.setRoles(Collections.singleton(Role.USER));
        user.setActive(true);
        return userRepository.save(user);

    }
}
