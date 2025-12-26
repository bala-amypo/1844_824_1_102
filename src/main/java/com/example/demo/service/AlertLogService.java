package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import java.util.List;

public interface AlertLogService {

    AlertLog createAlert(String message, Long userId, Long requestId);

    List<AlertLog> getAlertsByUser(Long userId);

    List<AlertLog> getAlertsByRequest(Long requestId);
}
