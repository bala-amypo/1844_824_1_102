package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public boolean login(String username, String password) {
        // dummy login
        return username.equals("admin") && password.equals("admin");
    }
}
