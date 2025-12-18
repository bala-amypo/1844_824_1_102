package com.example.demob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.collectiondb.entity.Warranty;
import com.example.collectiondb.service.WarrantyService;


@RestController
public class WarrantyController {
    @Autowired
    WarrantyService w;


    @PostMapping("/register/{userId}/{productId}")
    public Warranty registerWarranty(
        @PathVariable Long userId,
        @PathVariable Long productId){
        return 
               w.registerWarranty(userId,productId);

    }
    
    @PostMapping("/warrantyId")
    public Warranty getWarranty(
        @PathVariable Long WarrantyId
      {
        return 
               w.registerWarranty(warrantyId);

    }

    @GetMapping("/warrantyId")
   public Warranty 

    @GetMapping("/userId")
    public List<AuditTrailRecord> second(){
        return atrs.getAllLogs();
    }
}
