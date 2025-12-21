package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;

@RestController
@RequestMapping("/warranties")
public class WarrantyController {

    private final WarrantyService service;

    public WarrantyController(WarrantyService service) {
        this.service = service;
    }

    // POST - register a warranty
    @PostMapping
    public Warranty create(@RequestBody Warranty warranty) {
        return service.save(warranty);
    }

    // GET - all warranties
    @GetMapping
    public List<Warranty> getAll() {
        return service.getAll();
    }

    // GET - single warranty
    @GetMapping("/{id}")
    public Warranty getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // DELETE - remove warranty
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }

    // Optional: get warranties by user
    @GetMapping("/user/{user}")
    public List<Warranty> getByUser(@PathVariable String user) {
        return service.getByUser(user);
    }

    // Optional: get warranty by serial number
    @GetMapping("/serial/{serialNumber}")
    public Warranty getBySerial(@PathVariable String serialNumber) {
        return service.getBySerialNumber(serialNumber);
    }
}
