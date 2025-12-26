// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.entity.AlertSchedule;

// public interface AlertScheduleRepository extends JpaRepository<AlertSchedule, Long> {
// }

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.AlertSchedule;
import java.util.List;

public interface AlertScheduleRepository extends JpaRepository<AlertSchedule, Long> {

    List<AlertSchedule> findByWarranty(String warranty);

}
