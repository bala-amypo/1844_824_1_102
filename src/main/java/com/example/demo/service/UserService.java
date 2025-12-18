package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;

@Service
public class UserService {
    
    Map<Long, user> studentData=new HashMap<>();

    public user saveData(user student){
        studentData.put(student.getId(), student);
        return student;
    }
}






UserService.java