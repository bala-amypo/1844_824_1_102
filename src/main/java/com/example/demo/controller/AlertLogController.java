package com.example.demo.controller;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alert")
public class AlertLogController {

    private final AlertLogService service;

    public AlertLogController(AlertLogService service) {
        this.service = service;
    }

    @PostMapping
    public AlertLog create(@RequestBody AlertLog alert) {
        return service.createAlert(alert);
    }

    @GetMapping("/{id}")
    public AlertLog getById(@PathVariable Long id) {
        return service.getAlertById(id);
    }

    @GetMapping
    public List<AlertLog> getAll() {
        return service.getAllAlerts();
    }

    @PutMapping("/{id}")
    public AlertLog update(@PathVariable Long id, @RequestBody AlertLog alert) {
        return service.updateAlert(id, alert);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteAlert(id);
    }
}
