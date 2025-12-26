package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alert_logs")
public class AlertLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    // 1. Add this field
    private LocalDate logDate;

    @ManyToOne
    @JoinColumn(name = "warranty_id")
    private Warranty warranty;

    // ---------- Getters and Setters ----------

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    // 2. Add this Getter
    public LocalDate getLogDate() { return logDate; }

    // 3. Add this Setter (This is what the error is looking for!)
    public void setLogDate(LocalDate logDate) { this.logDate = logDate; }

    public Warranty getWarranty() { return warranty; }
    public void setWarranty(Warranty warranty) { this.warranty = warranty; }
}