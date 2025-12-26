package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "alert_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many logs belong to one warranty
    @ManyToOne
    @JoinColumn(name = "warranty_id")
    private Warranty warranty;

    private LocalDateTime sentAt;

    private String message;

    // Automatically set timestamp before saving
    @PrePersist
    public void prePersist() {
        this.sentAt = LocalDateTime.now();
    }
}
