package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alert_logs")
public class AlertLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private LocalDateTime sentAt; 

    @ManyToOne
    @JoinColumn(name = "warranty_id")
    private Warranty warranty;

    @PrePersist 
    public void prePersist() {
        this.sentAt = LocalDateTime.now();
    }
}