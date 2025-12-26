package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;

import java.util.List;

@RestController
@RequestMapping("/alertlog")
public class AlertLogController {

    @Autowired
    private AlertLogService alertLogService;

    @PostMapping("/create")
    public AlertLog createAlert(@RequestBody AlertLog alert) {
        return alertLogService.createAlert(alert);
    }

    @GetMapping("/all")
    public List<AlertLog> getAllAlerts() {
        return alertLogService.getAllAlerts();
    }

    @GetMapping("/{id}")
    public AlertLog getAlertById(@PathVariable Long id) {
        return alertLogService.getAlertById(id);
    }
}
