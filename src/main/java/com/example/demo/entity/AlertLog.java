package com.example.demo.entity;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlertLog {
    private Long id;
    private String message;
    private LocalDateTime sentAt;
    private Warranty warranty;
    
    public void prePersist() {
        this.sentAt = LocalDateTime.now();
    }
}