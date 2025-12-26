package com.example.demo.repository;

import com.example.demo.model.Warranty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarrantyRepository extends JpaRepository<Warranty, Long> {
}
