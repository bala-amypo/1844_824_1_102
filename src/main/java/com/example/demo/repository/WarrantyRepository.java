package com.example.demo.repository;

import com.example.demo.entity.Warranty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface WarrantyRepository extends JpaRepository<Warranty, Long> {

    // ✅ required by WarrantyServiceImpl
    boolean existsBySerialNumber(String serialNumber);

    // ✅ required by WarrantyServiceImpl & tests
    List<Warranty> findByUserId(Long userId);

    // ✅ required by tests (already discussed)
    List<Warranty> findWarrantiesExpiringBetween(LocalDate from, LocalDate to);
}
