package com.example.demo.service;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertScheduleServiceImpl implements AlertScheduleService {

    private final AlertScheduleRepository alertScheduleRepository;

    public AlertScheduleServiceImpl(AlertScheduleRepository alertScheduleRepository) {
        this.alertScheduleRepository = alertScheduleRepository;
    }

    @Override
    public AlertSchedule createSchedule(Long warrantyId, AlertSchedule schedule) {
        schedule.setwarranty(warrantyId.toString());
        return alertScheduleRepository.save(schedule);
    }

    @Override
    public List<AlertSchedule> getSchedules(Long warrantyId) {
        return alertScheduleRepository.findByWarranty(warrantyId.toString());
    }
}
