package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.collectiondb.entity.UserEntity;

@Service
public class UserService {
    
    Map<Long, studentEntity> studentData=new HashMap<>();

    public studentEntity saveData(studentEntity student){
        studentData.put(student.getId(), student);
        return student;
    }
}






UserService.java