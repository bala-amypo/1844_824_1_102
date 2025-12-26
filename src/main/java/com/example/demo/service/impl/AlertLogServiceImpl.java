package com.example.demo.service.impl;

import com.example.demo.entity.AlertLog;
import com.example.demo.entity.Warranty;
import com.example.demo.repository.AlertLogRepository; // Assuming this exists
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.AlertLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    private final WarrantyRepository warrantyRepository;
    private final AlertLogRepository alertLogRepository;

    // Inject both repositories via Constructor
    public AlertLogServiceImpl(WarrantyRepository warrantyRepository, AlertLogRepository alertLogRepository) {
        this.warrantyRepository = warrantyRepository;
        this.alertLogRepository = alertLogRepository;
    }

    @Override
    public List<Warranty> getExpiringWarranties(int days) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(days);
        return warrantyRepository.findByExpiryDateBetween(today, futureDate);
    }

    @Override
    public AlertLog addLog(Long warrantyId, String message) {
        AlertLog log = new AlertLog();
        
        // Find the warranty first to associate it with the log
        Warranty warranty = warrantyRepository.findById(warrantyId)
                .orElseThrow(() -> new RuntimeException("Warranty not found with id: " + warrantyId));
        
        log.setWarranty(warranty);
        log.setMessage(message);
        log.setLogDate(LocalDate.now());
        
        return alertLogRepository.save(log);
    }

    @Override
    public List<AlertLog> getLogs(Long warrantyId) {
        // This assumes you have a method findByWarrantyId in AlertLogRepository
        return alertLogRepository.findByWarrantyId(warrantyId);
    }
}