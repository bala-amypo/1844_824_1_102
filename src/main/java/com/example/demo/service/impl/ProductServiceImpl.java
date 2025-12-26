package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    @Autowired
    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public Product addProduct(Product product) {

        // Validation 1: Model number must exist
        if (product.getmodelNumber() == null || product.getmodelNumber().isEmpty()) {
            throw new RuntimeException("Model number required");
        }

        // Validation 2: Category must exist
        if (product.getcategory() == null || product.getcategory().isEmpty()) {
            throw new RuntimeException("Category required");
        }

        // Validation 3: Model number must be unique
        if (repo.existsByModelNumber(product.getmodelNumber())) {
            throw new RuntimeException("Duplicate model number");
        }

        return repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
