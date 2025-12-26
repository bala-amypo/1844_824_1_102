package com.example.demo.service.impl;

import com.example.demo.entity.Warranty;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.WarrantyService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class WarrantyServiceImpl implements WarrantyService {

    private final WarrantyRepository warrantyRepository;

    public WarrantyServiceImpl(WarrantyRepository warrantyRepository) {
        this.warrantyRepository = warrantyRepository;
    }

    @Override
    public Warranty addWarranty(Warranty warranty) {

        // Duplicate serial number check
        if (warrantyRepository.existsBySerialNumber(warranty.getSerialNumber())) {
            throw new IllegalArgumentException("Warranty with serial number already exists");
        }

        return warrantyRepository.save(warranty);
    }

    @Override
    public Warranty getWarrantyById(Long id) {
        return warrantyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Warranty not found"));
    }

    @Override
    public List<Warranty> getWarrantiesByUser(Long userId) {
        return warrantyRepository.findByUserId(userId);
    }

    @Override
    public List<Warranty> getWarrantiesExpiringBetween(LocalDate start, LocalDate end) {
        return warrantyRepository.findWarrantiesExpiringBetween(start, end);
    }
}
