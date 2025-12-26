// package com.example.demo.controller;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import com.example.demo.entity.AlertSchedule;
// import com.example.demo.service.AlertScheduleService;

// @RestController
// @RequestMapping("/alertSchedule")
// public class AlertScheduleController {

//     private final AlertScheduleService service;

//     public AlertScheduleController(AlertScheduleService service) {
//         this.service = service;
//     }

    
//     @PostMapping
//     public AlertSchedule create(@RequestBody AlertSchedule schedule) {
//         return service.save(schedule);
//     }

    
//     @GetMapping
//     public List<AlertSchedule> getAll() {
//         return service.getAll();
//     }

    
//     @GetMapping("/{id}")
//     public AlertSchedule getById(@PathVariable Long id) {
//         return service.getById(id);
//     }

   
//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         return service.delete(id);
//     }
// }

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class AlertScheduleController {

    private final AlertScheduleService service;

    @Autowired
    public AlertScheduleController(AlertScheduleService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public AlertSchedule create(@RequestBody AlertSchedule schedule) {
        return service.createSchedule(schedule);
    }

    @GetMapping("/{warranty}")
    public List<AlertSchedule> getSchedules(@PathVariable String warranty) {
        return service.getSchedules(warranty);
    }
}

