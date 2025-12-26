package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

// @Entity
// public class AlertLog {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private long id;
//     private String warranty;
//     private LocalDateTime sentAt;
//     private String message;

   
//     public Long getId() {
//         return id;
//     }
//     public void setId(long id) {
//         this.id = id;
//     }

//     public String getWarranty() {
//         return warranty;
//     }
//     public void setWarranty(String warranty) {
//         this.warranty = warranty;
//     }

//     public LocalDateTime getSentAt() {
//         return sentAt;
//     }
//     public void setSentAt(LocalDateTime sentAt) {
//         this.sentAt = sentAt;
//     }

//     public String getMessage() {
//         return message;
//     }
//     public void setMessage(String message) {
//         this.message = message;
//     }

   
//     public AlertLog(Long id, String warranty, LocalDateTime sentAt, String message) {
//         this.id = id;
//         this.warranty = warranty;
//         this.sentAt = sentAt;
//         this.message = message;
//     }

//     public AlertLog() {
//     }
// }

@Entity
public class AlertLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    private String message;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // which user is affected OR created the action

    @ManyToOne
    @JoinColumn(name = "request_id")
    private ServiceRequest serviceRequest;  // related to which request
}

