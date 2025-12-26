

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;

import java.util.List;

@RestController
@RequestMapping("/warranties")
public class WarrantyController {

    private final WarrantyService service;

    @Autowired
    public WarrantyController(WarrantyService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public Warranty register(@RequestBody Warranty warranty) {
        return service.registerWarranty(warranty);
    }

    @GetMapping("/{id}")
    public Warranty getWarranty(@PathVariable Long id) {
        return service.getWarranty(id);
    }

    @GetMapping("/user/{user}")
    public List<Warranty> getUserWarranties(@PathVariable String user) {
        return service.getUserWarranties(user);
    }
}

