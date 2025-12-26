package com.example.demo.repository;

import com.example.demo.entity.Warranty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface WarrantyRepository extends JpaRepository<Warranty, Long> {

    boolean existsBySerialNumber(String serialNumber);

    List<Warranty> findByUserId(Long userId);

    // This is the correct method that Spring uses to query the 'expiryDate' field
    List<Warranty> findByExpiryDateBetween(LocalDate start, LocalDate end);
    
    // REMOVED: findWarrantiesExpiringBetween (This was causing the crash)
}