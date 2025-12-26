package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate purchaseDate;
    private LocalDate expiryDate;
    private String serialNumber;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    public Warranty() {}

    // builder-style factory (needed by tests)
    public static WarrantyBuilder builder() {
        return new WarrantyBuilder();
    }

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    // ---------- Builder ----------
    public static class WarrantyBuilder {
        private final Warranty w = new Warranty();

        public WarrantyBuilder purchaseDate(LocalDate d) {
            w.setPurchaseDate(d);
            return this;
        }

        public WarrantyBuilder expiryDate(LocalDate d) {
            w.setExpiryDate(d);
            return this;
        }

        public WarrantyBuilder serialNumber(String s) {
            w.setSerialNumber(s);
            return this;
        }

        public WarrantyBuilder user(User u) {
            w.setUser(u);
            return this;
        }

        public WarrantyBuilder product(Product p) {
            w.setProduct(p);
            return this;
        }

        public Warranty build() {
            return w;
        }
    }
}
