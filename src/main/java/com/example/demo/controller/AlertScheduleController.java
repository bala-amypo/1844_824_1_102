package com.example.demo.controller;

import java.util.List;
import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/alertSchedule")
public class AlertScheduleController {

    private final AlertScheduleService service;

    public AlertScheduleController(AlertScheduleService service) {
        this.service = service;
    }

    
    @PostMapping
    public AlertSchedule create(@RequestBody AlertSchedule schedule) {
        return service.save(schedule);
    }

    
    @GetMapping
    public List<AlertSchedule> getAll() {
        return service.getAll();
    }

    
    @GetMapping("/{id}")
    public AlertSchedule getById(@PathVariable Long id) {
        return service.getById(id);
    }

   
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
