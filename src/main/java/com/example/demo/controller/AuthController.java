// package com.example.demo.controller;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import com.example.demo.entity.User;
// import com.example.demo.service.UserService;

// @RestController
// @RequestMapping("/users")
// public class AuthController {

//     private final UserService service;

//     public AuthController(UserService service) {
//         this.service = service;
//     }

   
//     @PostMapping
//     public User create(@RequestBody User user) {
//         return service.save(user);
//     }

   
//     @GetMapping
//     public List<User> getAll() {
//         return service.getAll();
//     }

   
//     @GetMapping("/{id}")
//     public User getById(@PathVariable Long id) {
//         return service.getById(id);
//     }

   
//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         return service.delete(id);
//     }

 
//     @GetMapping("/email/{email}")
//     public User getByEmail(@PathVariable String email) {
//         return service.getByEmail(email);
//     }
// / 
//  /}
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestParam String email, @RequestParam String password) {
        return service.login(email, password);
    }
}

