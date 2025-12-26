package com.example.demo.service;

import com.example.demo.entity.Warranty;

import java.time.LocalDate;
import java.util.List;

public interface WarrantyService {

    Warranty addWarranty(Warranty warranty);

    Warranty getWarrantyById(Long id);

    List<Warranty> getWarrantiesByUser(Long userId);

    List<Warranty> getWarrantiesExpiringBetween(LocalDate start, LocalDate end);
}
