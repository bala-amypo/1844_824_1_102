package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    @Autowired
    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;  // constructor injection
    }

    @Override
    public User register(User user) {

        // Validation 1: Duplicate email check
        if (repo.existsByEmail(user.getemail())) {
            throw new RuntimeException("Duplicate email - email already exists");
        }

        // Validation 2: default role
        if (user.getrole() == null || user.getrole().isEmpty()) {
            user.setrole("USER");
        }

        // Validation 3: password should not be empty
        if (user.getpassword() == null || user.getpassword().isEmpty()) {
            throw new RuntimeException("Password required");
        }

        return repo.save(user);
    }

    @Override
    public User login(String email, String password) {

        User user = repo.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        if (!user.getpassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return user;
    }

    @Override
    public User findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
