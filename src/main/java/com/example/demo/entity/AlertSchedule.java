package com.example.demo.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlertSchedule {
    private Long id;
    private Integer daysBeforeExpiry;
    private Boolean enabled;
    private Warranty warranty;
}