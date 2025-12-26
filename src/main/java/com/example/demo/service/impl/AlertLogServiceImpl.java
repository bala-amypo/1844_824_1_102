package com.example.demo.service.impl;

import com.example.demo.entity.Warranty;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.AlertLogService; // 1. Import the interface
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService { // 2. Add 'implements'

    private final WarrantyRepository warrantyRepository;

    public AlertLogServiceImpl(WarrantyRepository warrantyRepository) {
        this.warrantyRepository = warrantyRepository;
    }

    @Override // 3. Good practice to add this
    public List<Warranty> getExpiringWarranties(int days) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(days);

        return warrantyRepository.findByExpiryDateBetween(today, futureDate);
    }
}