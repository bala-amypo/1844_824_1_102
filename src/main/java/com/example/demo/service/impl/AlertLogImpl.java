package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.AlertLog;
import com.example.demo.repository.AlertLogRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    @Autowired
    private AlertLogRepository alertLogRepository;

    @Override
    public AlertLog createAlert(AlertLog alert) {
        alert.setsentAt(LocalDateTime.now());
        return alertLogRepository.save(alert);
    }

    @Override
    public List<AlertLog> getAllAlerts() {
        return alertLogRepository.findAll();
    }

    @Override
    public AlertLog getAlertById(Long id) {
        return alertLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alert Not Found"));
    }
}
