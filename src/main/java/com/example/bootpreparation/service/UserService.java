package com.example.bootpreparation.service;

import com.example.bootpreparation.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User add(User user);
    List<User> findAll();
    void deleteById(Long id);
}
