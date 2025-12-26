package com.example.demo.service;

import com.example.demo.entity.AlertSchedule;

import java.util.List;

public interface AlertScheduleService {

    AlertSchedule addSchedule(AlertSchedule schedule);

    List<AlertSchedule> getSchedulesByWarranty(Long warrantyId);
}
