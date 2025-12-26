package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import com.example.demo.repository.AlertLogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    private final AlertLogRepository alertLogRepository;

    public AlertLogServiceImpl(AlertLogRepository alertLogRepository) {
        this.alertLogRepository = alertLogRepository;
    }

    @Override
    public AlertLog addLog(Long warrantyId, String message) {
        AlertLog log = new AlertLog();
        log.setwarranty(warrantyId.toString());
        log.setmessage(message);
        log.setsentAt(LocalDateTime.now());
        return alertLogRepository.save(log);
    }

    @Override
    public List<AlertLog> getLogs(Long warrantyId) {
        return alertLogRepository.findByWarranty(warrantyId.toString());
    }
}
