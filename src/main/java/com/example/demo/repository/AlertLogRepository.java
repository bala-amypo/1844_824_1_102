package com.example.demo.repository;

import com.example.demo.entity.AlertLog;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertLogRepository extends JpaRepository<AlertLog, Long> {

    List<AlertLog> findByUserId(Long userId);

    List<AlertLog> findByServiceRequestRequestId(Long requestId);
}
