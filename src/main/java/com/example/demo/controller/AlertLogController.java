package com.example.demo.controller;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/logs")
@Tag(name = "Alert Logs")
public class AlertLogController {

    private final AlertLogService logService;

    public AlertLogController(AlertLogService logService) {
        this.logService = logService;
    }

    @PostMapping("/{warrantyId}")
    @Operation(summary = "Add an alert log for a warranty")
    public AlertLog addLog(
            @PathVariable Long warrantyId,
            @RequestBody String message) {
        return logService.addLog(warrantyId, message);
    }

    @GetMapping("/{warrantyId}")
    @Operation(summary = "Get alert logs for a warranty")
    public List<AlertLog> getLogs(@PathVariable Long warrantyId) {
        return logService.getLogs(warrantyId);
    }
}
