package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Warranty;
import com.example.demo.repository.WarrantyRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WarrantyServiceImpl implements WarrantyService {

    private final WarrantyRepository repo;

    @Autowired
    public WarrantyServiceImpl(WarrantyRepository repo) {
        this.repo = repo;
    }

    @Override
    public Warranty registerWarranty(Warranty warranty) {

        // Rule 1: Serial number must be unique
        if (repo.existsBySerialNumber(warranty.getserialNumber())) {
            throw new RuntimeException("Serial number must be unique");
        }

        // Rule 2: Expiry > Purchase date
        LocalDateTime purchase = warranty.getpurchaseDate();
        LocalDateTime expiry = warranty.getexpiryDate();

        if (expiry.isBefore(purchase)) {
            throw new RuntimeException("Expiry date must be after purchase date");
        }

        return repo.save(warranty);
    }

    @Override
    public Warranty getWarranty(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Warranty> getUserWarranties(String user) {
        return repo.findByUser(user);
    }
}
