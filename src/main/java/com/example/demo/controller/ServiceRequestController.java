package com.example.demo.controller;

import com.example.demo.entity.ServiceRequest;
import com.example.demo.service.ServiceRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
@CrossOrigin(origins = "*")   // allow frontend to access this backend
public class ServiceRequestController {

    private final ServiceRequestService service;

    public ServiceRequestController(ServiceRequestService service) {
        this.service = service;
    }

    // CREATE (POST)
    @PostMapping
    public ServiceRequest createRequest(@RequestBody ServiceRequest request) {
        return service.create(request);
    }

    // GET ALL (GET)
    @GetMapping
    public List<ServiceRequest> getAllRequests() {
        return service.getAll();
    }

    // GET BY ID (GET)
    @GetMapping("/{id}")
    public ServiceRequest getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE (PUT)
    @PutMapping("/{id}")
    public ServiceRequest updateRequest(
            @PathVariable Long id,
            @RequestBody ServiceRequest newReq
    ) {
        return service.update(id, newReq);
    }

    // DELETE (DELETE)
    @DeleteMapping("/{id}")
    public String deleteRequest(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}
