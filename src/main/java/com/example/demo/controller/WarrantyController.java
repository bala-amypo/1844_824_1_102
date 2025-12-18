package com.example.demob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.collectiondb.entity.Warranty;
import com.example.collectiondb.service.WarrantyService;


@RestController
public class WarrantyController {
    
    @Autowired
    studentService stuser;

    @PostMapping("/path")
    public studentEntity studatas(@RequestBody studentEntity student) {
        return stuser.saveData(student);
    }
    
}


studentController.java