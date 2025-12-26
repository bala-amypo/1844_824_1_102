package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private String modelNumber;
    private String category;

    @OneToMany(mappedBy = "product")
    private List<Warranty> warranties;

    // -------- GETTERS --------

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getCategory() {
        return category;
    }

    public List<Warranty> getWarranties() {
        return warranties;
    }

    // -------- SETTERS --------

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWarranties(List<Warranty> warranties) {
        this.warranties = warranties;
    }

    // -------- CONSTRUCTORS --------
    public Product() {}

    public Product(Long id, String name, String brand, String modelNumber, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.category = category;
    }
}
