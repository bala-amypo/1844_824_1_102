package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.collectiondb.entity.studentEntity;
import java.util.Lon;

@Repository
public interface stuRepo extends JpaRepository<studentEntity, Long>{

}





stuRepo.java