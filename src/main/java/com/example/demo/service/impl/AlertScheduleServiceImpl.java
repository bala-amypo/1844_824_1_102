package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.entity.Warranty;
import com.example.demo.repository.AlertScheduleRepository;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.AlertScheduleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertScheduleServiceImpl implements AlertScheduleService {

    private final AlertScheduleRepository scheduleRepo;
    private final WarrantyRepository warrantyRepo;

    public AlertScheduleServiceImpl(AlertScheduleRepository scheduleRepo, WarrantyRepository warrantyRepo) {
        this.scheduleRepo = scheduleRepo;
        this.warrantyRepo = warrantyRepo;
    }

    @Override
    public AlertSchedule createSchedule(Long warrantyId, AlertSchedule schedule) {

        Warranty w = warrantyRepo.findById(warrantyId).orElse(null);
        schedule.setWarranty(w);

        return scheduleRepo.save(schedule);
    }

    @Override
    public List<AlertSchedule> getAllSchedules() {
        return scheduleRepo.findAll();
    }

    @Override
    public AlertSchedule getScheduleById(Long id) {
        return scheduleRepo.findById(id).orElse(null);
    }
}
