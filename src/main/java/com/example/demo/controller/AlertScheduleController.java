package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;

@RestController
@RequestMapping("/alertSchedule")
public class AlertScheduleController {

    private final AlertScheduleService service;

    public AlertScheduleController(AlertScheduleService service) {
        this.service = service;
    }

    // POST - add new schedule
    @PostMapping
    public AlertSchedule create(@RequestBody AlertSchedule schedule) {
        return service.save(schedule);
    }

    // GET - get all schedules
    @GetMapping
    public List<AlertSchedule> getAll() {
        return service.getAll();
    }

    // GET - single schedule
    @GetMapping("/{id}")
    public AlertSchedule getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
