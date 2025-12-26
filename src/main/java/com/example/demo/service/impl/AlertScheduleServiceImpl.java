package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.AlertScheduleService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertScheduleServiceImpl implements AlertScheduleService {

    private final AlertScheduleRepository alertScheduleRepository;
    private final WarrantyRepository warrantyRepository;

    public AlertScheduleServiceImpl(AlertScheduleRepository alertScheduleRepository, WarrantyRepository warrantyRepository) {
        this.alertScheduleRepository = alertScheduleRepository;
        this.warrantyRepository = warrantyRepository;
    }

    @Override
    public AlertSchedule createSchedule(Long warrantyId, AlertSchedule schedule) {
        if (schedule.getDaysBeforeExpiry() != null && schedule.getDaysBeforeExpiry() < 0) {
            throw new IllegalArgumentException("daysBeforeExpiry cannot be negative");
        }
        
        return warrantyRepository.findById(warrantyId).map(warranty -> {
            schedule.setWarranty(warranty);
            return alertScheduleRepository.save(schedule);
        }).orElseThrow(() -> new RuntimeException("Warranty not found"));
    }

    @Override
    public List<AlertSchedule> getSchedules(Long warrantyId) {
        // FIX: Only throw "Should throw" if the warranty DOES NOT exist.
        // If it exists, return the list from the repository.
        if (!warrantyRepository.existsById(warrantyId)) {
            throw new RuntimeException("Should throw");
        }
        return alertScheduleRepository.findByWarrantyId(warrantyId);
    }
}