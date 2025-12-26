package com.example.demo.controller;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertScheduleService;
import com.example.demo.service.AlertLogService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {
    
    private final AlertScheduleService scheduleService;
    private final AlertLogService logService;
    
    public AlertController(AlertScheduleService scheduleService, AlertLogService logService) {
        this.scheduleService = scheduleService;
        this.logService = logService;
    }
    
    @PostMapping("/schedule/{warrantyId}")
    public AlertSchedule createSchedule(@PathVariable Long warrantyId, 
                                      @RequestBody AlertSchedule schedule) {
        return scheduleService.createSchedule(warrantyId, schedule);
    }
    
    @GetMapping("/schedule/{warrantyId}")
    public List<AlertSchedule> getSchedules(@PathVariable Long warrantyId) {
        return scheduleService.getSchedules(warrantyId);
    }
    
    @PostMapping("/log/{warrantyId}")
    public AlertLog addLog(@PathVariable Long warrantyId, @RequestBody String message) {
        return logService.addLog(warrantyId, message);
    }
    
    @GetMapping("/log/{warrantyId}")
    public List<AlertLog> getLogs(@PathVariable Long warrantyId) {
        return logService.getLogs(warrantyId);
    }
}