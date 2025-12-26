package com.example.demo.entity;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Warranty {
    private Long id;
    private LocalDate purchaseDate;
    private LocalDate expiryDate;
    private String serialNumber;
    private User user;
    private Product product;
}