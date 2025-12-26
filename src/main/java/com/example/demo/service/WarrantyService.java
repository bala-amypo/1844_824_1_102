// package com.example.demo.service;

// import org.springframework.stereotype.Service;
// import java.util.List;
// import com.example.demo.entity.Warranty;
// import com.example.demo.repository.WarrantyRepository;

// @Service
// public class WarrantyService {

//     private final WarrantyRepository repo;

//     public WarrantyService(WarrantyRepository repo) {
//         this.repo = repo;
//     }

//     public Warranty save(Warranty warranty) {
//         return repo.save(warranty);
//     }

//     public List<Warranty> getAll() {
//         return repo.findAll();
//     }

//     public Warranty getById(Long id) {
//         return repo.findById(id).orElse(null);
//     }

//     public String delete(Long id) {
//         repo.deleteById(id);
//         return "Deleted Successfully";
//     }

   
//     public List<Warranty> getByUser(String user) {
//         return repo.findByUser(user);
//     }

//     public Warranty getBySerialNumber(String serialNumber) {
//         return repo.findBySerialNumber(serialNumber);
//     }
// }

package com.example.demo.service;

import com.example.demo.entity.Warranty;
import java.util.List;

public interface WarrantyService {

    Warranty registerWarranty(Warranty warranty);

    Warranty getWarranty(Long id);

    List<Warranty> getUserWarranties(String user);

}

