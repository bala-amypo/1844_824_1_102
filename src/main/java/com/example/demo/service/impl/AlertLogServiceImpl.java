package com.example.demo.service.impl;

import com.example.demo.entity.AlertLog;
import com.example.demo.repository.AlertLogRepository;
import com.example.demo.service.AlertLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    private final AlertLogRepository alertLogRepository;

    public AlertLogServiceImpl(AlertLogRepository alertLogRepository) {
        this.alertLogRepository = alertLogRepository;
    }

    @Override
    public AlertLog addLog(AlertLog log) {
        return alertLogRepository.save(log);
    }

    @Override
    public List<AlertLog> getLogsByWarranty(Long warrantyId) {
        return alertLogRepository.findByWarrantyId(warrantyId);
    }
}
