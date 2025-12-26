

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping("/list")
    public List<Product> listProducts() {
        return service.getAllProducts();
    }
}
