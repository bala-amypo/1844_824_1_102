// package com.example.demo.controller;
// import com.example.demo.entity.AlertLog;
// import com.example.demo.service.AlertLogService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// @RestController
// @RequestMapping("/logs")
// public class AlertLogController {

//     private final AlertLogService service;

//     public AlertLogController(AlertLogService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public AlertLog addLog(@RequestBody AlertLog log) {
//         return service.addLog(log);
//     }

//     @GetMapping("/{id}")
//     public AlertLog getLog(@PathVariable Long id) {
//         return service.getLog(id);
//     }

//     @GetMapping
//     public List<AlertLog> getAllLogs() {
//         return service.getAllLogs();
//     }
// }

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;

import java.util.List;

@RestController
@RequestMapping("/alert")
public class AlertLogController {

    @Autowired
    private AlertLogService alertLogService;

    @PostMapping("/create")
    public AlertLog createAlert(
            @RequestParam String message,
            @RequestParam Long userId,
            @RequestParam Long requestId) {

        return alertLogService.createAlert(message, userId, requestId);
    }

    @GetMapping("/user/{userId}")
    public List<AlertLog> getUserAlerts(@PathVariable Long userId) {
        return alertLogService.getAlertsByUser(userId);
    }

    @GetMapping("/request/{requestId}")
    public List<AlertLog> getRequestAlerts(@PathVariable Long requestId) {
        return alertLogService.getAlertsByRequest(requestId);
    }
}

