package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // POST - add a product
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }

    // GET - get all products
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    // GET - get one product
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // DELETE - remove product
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
