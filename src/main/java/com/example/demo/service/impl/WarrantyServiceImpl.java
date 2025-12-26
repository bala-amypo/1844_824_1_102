package com.example.demo.service.impl;

import com.example.demo.entity.Warranty;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.WarrantyService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Tells Spring to manage this class
public class WarrantyServiceImpl implements WarrantyService { // Must implement the interface

    private final WarrantyRepository warrantyRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public WarrantyServiceImpl(WarrantyRepository warrantyRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.warrantyRepository = warrantyRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Warranty registerWarranty(Long userId, Long productId, Warranty warranty) {
        // Logic to validate dates (required for test 12)
        if (warranty.getExpiryDate() != null && warranty.getPurchaseDate() != null) {
            if (!warranty.getExpiryDate().isAfter(warranty.getPurchaseDate())) {
                throw new IllegalArgumentException("Expiry date must be after purchase date");
            }
        }
        
        // Logic to check unique serial (required for test 48)
        if (warrantyRepository.existsBySerialNumber(warranty.getSerialNumber())) {
            throw new IllegalArgumentException("Serial number must be unique");
        }

        warranty.setUser(userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found")));
        warranty.setProduct(productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found")));
        
        return warrantyRepository.save(warranty);
    }

    @Override
    public List<Warranty> getUserWarranties(Long userId) {
        return warrantyRepository.findByUserId(userId);
    }

    @Override
    public Warranty getWarranty(Long id) {
        return warrantyRepository.findById(id).orElseThrow(() -> new RuntimeException("Warranty not found"));
    }
}