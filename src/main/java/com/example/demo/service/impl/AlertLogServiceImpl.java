package com.example.demo.service.impl;

import com.example.demo.entity.Warranty;
import com.example.demo.repository.WarrantyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlertLogServiceImpl {

    private final WarrantyRepository warrantyRepository;

    public AlertLogServiceImpl(WarrantyRepository warrantyRepository) {
        this.warrantyRepository = warrantyRepository;
    }

    public List<Warranty> getExpiringWarranties(int days) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(days);

        // ✅ UPDATED METHOD NAME
        return warrantyRepository.findByExpiryDateBetween(today, futureDate);
    }
}
