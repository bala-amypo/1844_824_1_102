package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alert_schedules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many schedules belong to one warranty
    @ManyToOne
    @JoinColumn(name = "warranty_id")
    private Warranty warranty;

    private Integer daysBeforeExpiry;

    private Boolean enabled;
}
