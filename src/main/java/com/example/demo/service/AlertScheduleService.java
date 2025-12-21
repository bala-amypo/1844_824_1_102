package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;

@Service
public class AlertScheduleService {

    private final AlertScheduleRepository repo;

    public AlertScheduleService(AlertScheduleRepository repo) {
        this.repo = repo;
    }

    public AlertSchedule save(AlertSchedule schedule) {
        return repo.save(schedule);
    }

    public List<AlertSchedule> getAll() {
        return repo.findAll();
    }

    public AlertSchedule getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public String delete(Long id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}
