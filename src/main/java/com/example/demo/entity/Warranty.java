package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;
    private String warrantyNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // ----------------- GETTERS -----------------

    public Long getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getWarrantyNumber() {
        return warrantyNumber;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    // ----------------- SETTERS -----------------

    public void setId(Long id) {
        this.id = id;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setWarrantyNumber(String warrantyNumber) {
        this.warrantyNumber = warrantyNumber;
    }

    // ⭐ FIXED: These were missing ⭐
    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // ❌ DO NOT CREATE setWarranty() (invalid)

    // ----------------- CONSTRUCTORS -----------------

    public Warranty() {}

    public Warranty(Long id, LocalDate startDate, LocalDate endDate,
                    String warrantyNumber, User user, Product product) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.warrantyNumber = warrantyNumber;
        this.user = user;
        this.product = product;
    }
}
