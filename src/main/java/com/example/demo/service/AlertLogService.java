package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import com.example.demo.repository.AlertLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertLogService {

    private final AlertLogRepository repo;

    public AlertLogService(AlertLogRepository repo) {
        this.repo = repo;
    }

    public AlertLog addLog(AlertLog log) {
        return repo.save(log);
    }

    public AlertLog getLog(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<AlertLog> getAllLogs() {
        return repo.findAll();
    }
}
