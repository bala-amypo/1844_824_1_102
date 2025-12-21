package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    // POST - add new user
    @PostMapping
    public User create(@RequestBody User user) {
        return service.save(user);
    }

    // GET - all users
    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    // GET - single user by ID
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // DELETE - remove user
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }

    // Optional: GET by email
    @GetMapping("/email/{email}")
    public User getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }
}
