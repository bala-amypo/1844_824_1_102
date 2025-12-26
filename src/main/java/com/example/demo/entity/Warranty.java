package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "warranties")
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    private LocalDate purchaseDate;
    private LocalDate expiryDate;

    @Column(unique = true)
    private String serialNumber;

    // ---------- Constructors ----------
    public Warranty() {}

    public Warranty(Long id, User user, Product product,
                    LocalDate purchaseDate, LocalDate expiryDate,
                    String serialNumber) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.serialNumber = serialNumber;
    }

    // ---------- Builder ----------
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private User user;
        private Product product;
        private LocalDate purchaseDate;
        private LocalDate expiryDate;
        private String serialNumber;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Builder product(Product product) {
            this.product = product;
            return this;
        }

        public Builder purchaseDate(LocalDate purchaseDate) {
            this.purchaseDate = purchaseDate;
            return this;
        }

        public Builder expiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Warranty build() {
            return new Warranty(id, user, product, purchaseDate, expiryDate, serialNumber);
        }
    }

    // ---------- Getters & Setters ----------
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
}
