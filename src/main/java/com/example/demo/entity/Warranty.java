package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "warranties")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many warranties belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Many warranties belong to one product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private LocalDate purchaseDate;

    private LocalDate expiryDate;

    @Column(unique = true)
    private String serialNumber;

    // One warranty can have many alert schedules
    @OneToMany(mappedBy = "warranty", cascade = CascadeType.ALL)
    private List<AlertSchedule> alertSchedules;

    // One warranty can have many alert logs
    @OneToMany(mappedBy = "warranty", cascade = CascadeType.ALL)
    private List<AlertLog> alertLogs;
}
