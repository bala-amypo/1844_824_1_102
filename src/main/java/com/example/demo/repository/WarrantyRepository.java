package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Warranty;

import java.util.List;

public interface WarrantyRepository extends JpaRepository<Warranty, Long> {

    
    List<Warranty> findByUser(String user);
    Warranty findBySerialNumber(String serialNumber);
}
