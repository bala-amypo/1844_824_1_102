package com.example.demo.service.impl;

import com.example.demo.entity.AlertLog;
import com.example.demo.entity.Warranty;
import com.example.demo.repository.AlertLogRepository;
import com.example.demo.repository.WarrantyRepository;
import java.util.List;

public class AlertLogServiceImpl {
    private final AlertLogRepository logRepository;
    private final WarrantyRepository warrantyRepository;

    public AlertLogServiceImpl(AlertLogRepository logRepository, 
                              WarrantyRepository warrantyRepository) {
        this.logRepository = logRepository;
        this.warrantyRepository = warrantyRepository;
    }

    public AlertLog addLog(Long warrantyId, String message) {
        Warranty warranty = warrantyRepository.findById(warrantyId)
            .orElseThrow(() -> new RuntimeException("Warranty not found"));

        AlertLog log = AlertLog.builder()
            .message(message)
            .warranty(warranty)
            .build();
        
        return logRepository.save(log);
    }

    public List<AlertLog> getLogs(Long warrantyId) {
        if (!warrantyRepository.findById(warrantyId).isPresent()) {
            throw new RuntimeException("Warranty not found");
        }
        return logRepository.findByWarrantyId(warrantyId);
    }
}