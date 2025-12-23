package com.example.demo.controller;
import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/logs")
public class AlertLogController {

    private final AlertLogService service;

    public AlertLogController(AlertLogService service) {
        this.service = service;
    }

    @PostMapping
    public AlertLog addLog(@RequestBody AlertLog log) {
        return service.addLog(log);
    }

    @GetMapping("/{id}")
    public AlertLog getLog(@PathVariable Long id) {
        return service.getLog(id);
    }

    @GetMapping
    public List<AlertLog> getAllLogs() {
        return service.getAllLogs();
    }
}
