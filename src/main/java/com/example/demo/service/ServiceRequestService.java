package com.example.demo.service;

import com.example.demo.entity.ServiceRequest;
import com.example.demo.repository.ServiceRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceRequestService {

    private final ServiceRequestRepository repo;

    public ServiceRequestService(ServiceRequestRepository repo) {
        this.repo = repo;
    }

    // CREATE
    public ServiceRequest create(ServiceRequest request) {
        return repo.save(request);
    }

    // GET ALL
    public List<ServiceRequest> getAll() {
        return repo.findAll();
    }

    // GET BY ID
    public ServiceRequest getById(Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Request not found with id " + id));
    }

    // UPDATE
    public ServiceRequest update(Long id, ServiceRequest newReq) {
        ServiceRequest old = getById(id);

        old.setName(newReq.getName());
        old.setPhone(newReq.getPhone());
        old.setEmail(newReq.getEmail());
        old.setProblem(newReq.getProblem());
        old.setStatus(newReq.getStatus());

        return repo.save(old);
    }

    // DELETE
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
