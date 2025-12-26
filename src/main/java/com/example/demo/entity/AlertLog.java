package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDateTime;

@Entity
public class AlertLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    private String message;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private ServiceRequest serviceRequest;

    // Getters & Setters
    public Long getAlertId() {
        return alertId;
    }
    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }
    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    // Constructor with fields
    public AlertLog(Long alertId, String message, LocalDateTime timestamp, User user, ServiceRequest serviceRequest) {
        this.alertId = alertId;
        this.message = message;
        this.timestamp = timestamp;
        this.user = user;
        this.serviceRequest = serviceRequest;
    }

    // Default constructor
    public AlertLog() {}
}
