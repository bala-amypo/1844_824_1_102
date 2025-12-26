package com.example.demo.entity;

public class Product {

    private Long id;
    private String name;
    private String brand;
    private String modelNumber;
    private String category;

    public Product() {}

    public Product(Long id, String name, String brand, String modelNumber, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.category = category;
    }

    // getters required by tests
    public String getName() {
        return name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getCategory() {
        return category;
    }

    // setters required by tests
    public void setName(String name) {
        this.name = name;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // builder required by tests
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Product p = new Product();

        public Builder name(String name) {
            p.name = name;
            return this;
        }

        public Builder brand(String brand) {
            p.brand = brand;
            return this;
        }

        public Builder modelNumber(String modelNumber) {
            p.modelNumber = modelNumber;
            return this;
        }

        public Builder category(String category) {
            p.category = category;
            return this;
        }

        public Product build() {
            return p;
        }
    }
}
