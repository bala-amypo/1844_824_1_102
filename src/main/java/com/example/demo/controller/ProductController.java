// package com.example.demo.controller;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import com.example.demo.entity.Product;
// import com.example.demo.service.ProductService;

// @RestController
// @RequestMapping("/products")
// public class ProductController {

//     private final ProductService service;

//     public ProductController(ProductService service) {
//         this.service = service;
//     }

   
//     @PostMapping
//     public Product create(@RequestBody Product product) {
//         return service.save(product);
//     }

    
//     @GetMapping
//     public List<Product> getAll() {
//         return service.getAll();
//     }

  
//     @GetMapping("/{id}")
//     public Product getById(@PathVariable Long id) {
//         return service.getById(id);
//     }

//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         return service.delete(id);
//     }
// }

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
