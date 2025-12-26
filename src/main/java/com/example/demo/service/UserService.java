package com.example.demo.service;

import com.example.demo.entity.User;


import org.springframework.stereotype.Service; // 1. Ensure this is imported

@Service // 2. ADD THIS ANNOTATION

public interface UserService {

    User register(User user);

    User findByEmail(String email);
}
