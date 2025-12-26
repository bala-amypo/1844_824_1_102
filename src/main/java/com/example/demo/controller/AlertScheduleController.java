package com.example.demo.controller;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<AlertSchedule> createSchedule(
            @PathVariable Long warrantyId,
            @RequestBody AlertSchedule schedule) {
        AlertSchedule saved = scheduleService.createSchedule(warrantyId, schedule);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{warrantyId}")
    @Operation(summary = "Get all schedules for a warranty")
    public ResponseEntity<List<AlertSchedule>> getSchedules(@PathVariable Long warrantyId) {
        List<AlertSchedule> schedules = scheduleService.getSchedules(warrantyId);
        return ResponseEntity.ok(schedules);
    }
}
