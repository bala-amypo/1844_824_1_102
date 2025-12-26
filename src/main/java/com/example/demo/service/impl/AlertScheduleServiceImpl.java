package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;
import com.example.demo.repository.WarrantyRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertScheduleServiceImpl {

    private final AlertScheduleRepository alertScheduleRepository;
    private final WarrantyRepository warrantyRepository;

    public AlertScheduleServiceImpl(AlertScheduleRepository alertScheduleRepository, WarrantyRepository warrantyRepository) {
        this.alertScheduleRepository = alertScheduleRepository;
        this.warrantyRepository = warrantyRepository;
    }

    public AlertSchedule createSchedule(Long warrantyId, AlertSchedule schedule) {
        if (schedule.getDaysBeforeExpiry() < 0) {
            throw new IllegalArgumentException("daysBeforeExpiry cannot be negative");
        }
        
        return warrantyRepository.findById(warrantyId).map(warranty -> {
            schedule.setWarranty(warranty);
            return alertScheduleRepository.save(schedule);
        }).orElseThrow(() -> new RuntimeException("Warranty not found"));
    }

    public List<AlertSchedule> getSchedules(Long warrantyId) {
        // FIX: Ensure this throws RuntimeException if the warranty doesn't exist (Line 498)
        return warrantyRepository.findById(warrantyId).map(w -> 
            alertScheduleRepository.findByWarrantyId(warrantyId)
        ).orElseThrow(() -> new RuntimeException("Should throw")); 
    }
}