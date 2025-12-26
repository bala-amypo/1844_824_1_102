package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import com.example.demo.entity.Warranty; // Add this import
import java.util.List;

public interface AlertLogService {
    AlertLog addLog(Long warrantyId, String message);
    List<AlertLog> getLogs(Long warrantyId);
    
    // Add this line so the implementation is valid
    List<Warranty> getExpiringWarranties(int days); 
}