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


    @PostMapping("/register")
    public Warranty addAuditTrailRecord(@RequestBody AuditTrailRecord atr){
        return atrs.logEvent(atr);
    }

    @GetMapping("/warrantyId")
    public int first(Long credentialId){
        return atrs.getLogs();
    }

    @GetMapping("/userId")
    public List<AuditTrailRecord> second(){
        return atrs.getAllLogs();
    }
}
