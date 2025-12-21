package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class AlertSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String warranty;
    private int daysBeforeExpiry;
    private Boolean enabled;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getWarranty() {
        return warranty;
    }
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public int getDaysBeforeExpiry() {
        return daysBeforeExpiry;
    }
    public void setDaysBeforeExpiry(int daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AlertSchedule(Long id, String warranty, int daysBeforeExpiry, Boolean enabled) {
        this.id = id;
        this.warranty = warranty;
        this.daysBeforeExpiry = daysBeforeExpiry;
        this.enabled = enabled;
    }

   
    public AlertSchedule() {}
}
