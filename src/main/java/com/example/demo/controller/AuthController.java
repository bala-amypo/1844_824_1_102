package com.example.demo.controller;
import java.util.List;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/users")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

   
    @PostMapping
    public User create(@RequestBody User user) {
        return service.save(user);
    }

   
    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

   
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return service.getById(id);
    }

   
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }

 
    @GetMapping("/email/{email}")
    public User getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }
}
