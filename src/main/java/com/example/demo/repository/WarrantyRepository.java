package com.example.demo.repository;

import com.example.demo.entity.Warranty;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface WarrantyRepository {
    Warranty save(Warranty warranty);
    Optional<Warranty> findById(Long id);
    List<Warranty> findByUserId(Long userId);
    boolean existsBySerialNumber(String serialNumber);
    List<Warranty> findWarrantiesExpiringBetween(LocalDate from, LocalDate to);
}