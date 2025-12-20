package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import java.util.List;

public interface AlertLogService {

    AlertLog createAlert(AlertLog alert);

    AlertLog getAlertById(Long id);

    List<AlertLog> getAllAlerts();

    AlertLog updateAlert(Long id, AlertLog alert);

    void deleteAlert(Long id);
}
