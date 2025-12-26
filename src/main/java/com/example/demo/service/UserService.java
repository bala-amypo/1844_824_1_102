// package com.example.demo.service;

// import org.springframework.stereotype.Service;
// import java.util.List;
// import com.example.demo.entity.User;
// import com.example.demo.repository.UserRepository;

// @Service
// public class UserService {

//     private final UserRepository repo;

//     public UserService(UserRepository repo) {
//         this.repo = repo;
//     }

//     public User save(User user) {
//         return repo.save(user);
//     }

//     public List<User> getAll() {
//         return repo.findAll();
//     }

//     public User getById(Long id) {
//         return repo.findById(id).orElse(null);
//     }

//     public String delete(Long id) {
//         repo.deleteById(id);
//         return "Deleted Successfully";
//     }

//     public User getByEmail(String email) {
//         return repo.findByEmail(email);
//     }
// / }

package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    User register(User user);
    User login(String email, String password);
    User findByEmail(String email);
}

