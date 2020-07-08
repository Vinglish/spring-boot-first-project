package com.example.bootpreparation.repository;

import com.example.bootpreparation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
