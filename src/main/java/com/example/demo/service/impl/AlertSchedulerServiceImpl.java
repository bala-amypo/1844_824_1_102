package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;

@Service
public class AlertScheduleServiceImpl implements AlertScheduleService {

    private final AlertScheduleRepository repo;

    @Autowired
    public AlertScheduleServiceImpl(AlertScheduleRepository repo) {
        this.repo = repo;
    }

    @Override
    public AlertSchedule createSchedule(AlertSchedule schedule) {

        // Rule: daysBeforeExpiry should be >= 0
        if (schedule.getdaysBeforeExpiry() < 0) {
            throw new RuntimeException("daysBeforeExpiry must be positive");
        }

        if (schedule.getenabled() == null) {
            schedule.setenabled(true); // default enabled
        }

        return repo.save(schedule);
    }

    @Override
    public List<AlertSchedule> getSchedules(String warranty) {
        return repo.findByWarranty(warranty);
    }
}
