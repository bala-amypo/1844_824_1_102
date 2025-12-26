package com.example.demo.controller;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/schedules")
@Tag(name = "Alert Schedules")
public class AlertScheduleController {

    private final AlertScheduleService scheduleService;

    public AlertScheduleController(AlertScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping("/{warrantyId}")
    @Operation(summary = "Create alert schedule for a warranty")
    public AlertSchedule createSchedule(
            @PathVariable Long warrantyId,
            @RequestBody AlertSchedule schedule) {
        return scheduleService.createSchedule(warrantyId, schedule);
    }

    @GetMapping("/{warrantyId}")
    @Operation(summary = "Get alert schedules for a warranty")
    public List<AlertSchedule> getSchedules(@PathVariable Long warrantyId) {
        return scheduleService.getSchedules(warrantyId);
    }
}
