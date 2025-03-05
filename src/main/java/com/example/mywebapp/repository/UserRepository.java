package com.example.mywebapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mywebapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}