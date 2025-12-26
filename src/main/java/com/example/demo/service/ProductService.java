// package com.example.demo.service;

// import org.springframework.stereotype.Service;
// import java.util.List;
// import com.example.demo.entity.Product;
// import com.example.demo.repository.ProductRepository;

// @Service
// public class ProductService {

//     private final ProductRepository repo;

//     public ProductService(ProductRepository repo) {
//         this.repo = repo;
//     }

//     public Product save(Product product) {
//         return repo.save(product);
//     }

//     public List<Product> getAll() {
//         return repo.findAll();
//     }

//     public Product getById(Long id) {
//         return repo.findById(id).orElse(null);
//     }

//     public String delete(Long id) {
//         repo.deleteById(id);
//         return "Deleted Successfully";
//     }
// }

package com.example.demo.service;

import com.example.demo.entity.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
}

