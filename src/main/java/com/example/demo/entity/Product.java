package com.example.semo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.id;
import jakarta.persistence.Unique;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;

@Entity
public class Product{
    @idGeneratedValues(strategy=GenerationType.IDENTITY)
private Long id;
private String  name;
private String brand;
private String modelNumber;
private String category;





    
}