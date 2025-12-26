package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.Product;
import com.example.demo.entity.Warranty;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.WarrantyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarrantyServiceImpl implements WarrantyService {

    private final WarrantyRepository warrantyRepo;
    private final UserRepository userRepo;
    private final ProductRepository productRepo;

    public WarrantyServiceImpl(WarrantyRepository warrantyRepo, UserRepository userRepo, ProductRepository productRepo) {
        this.warrantyRepo = warrantyRepo;
        this.userRepo = userRepo;
        this.productRepo = productRepo;
    }

    @Override
    public Warranty registerWarranty(Long userId, Long productId, Warranty warranty) {

        User user = userRepo.findById(userId).orElse(null);
        Product product = productRepo.findById(productId).orElse(null);

        warranty.setUser(user);
        warranty.setProduct(product);

        return warrantyRepo.save(warranty);
    }

    @Override
    public List<Warranty> getAllWarranties() {
        return warrantyRepo.findAll();
    }

    @Override
    public Warranty getWarrantyById(Long id) {
        return warrantyRepo.findById(id).orElse(null);
    }
}
