package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.AlertLogRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.ServiceRequestRepository;

import com.example.demo.entity.AlertLog;
import com.example.demo.entity.User;
import com.example.demo.entity.ServiceRequest;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    @Autowired
    private AlertLogRepository alertLogRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @Override
    public AlertLog createAlert(String message, Long userId, Long requestId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        ServiceRequest request = serviceRequestRepository.findById(requestId)
                .orElseThrow(() -> new RuntimeException("Request Not Found"));

        AlertLog alert = new AlertLog();
        alert.setMessage(message);
        alert.setTimestamp(LocalDateTime.now());
        alert.setUser(user);
        alert.setServiceRequest(request);

        return alertLogRepository.save(alert);
    }

    @Override
    public List<AlertLog> getAlertsByUser(Long userId) {
        return alertLogRepository.findByUserId(userId);
    }

    @Override
    public List<AlertLog> getAlertsByRequest(Long requestId) {
        return alertLogRepository.findByServiceRequestRequestId(requestId);
    }
}
