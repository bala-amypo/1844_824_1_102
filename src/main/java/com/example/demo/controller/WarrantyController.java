package com.example.demo.controller;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warranties")
@Tag(name = "Warranties")
public class WarrantyController {

    private final WarrantyService warrantyService;

    public WarrantyController(WarrantyService warrantyService) {
        this.warrantyService = warrantyService;
    }

    @PostMapping("/register/{userId}/{productId}")
    @Operation(summary = "Register a warranty for a user and product")
    public ResponseEntity<Warranty> registerWarranty(
            @PathVariable Long userId,
            @PathVariable Long productId,
            @RequestBody Warranty warranty) {
        Warranty saved = warrantyService.registerWarranty(userId, productId, warranty);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{warrantyId}")
    @Operation(summary = "Get warranty by ID")
    public ResponseEntity<Warranty> getWarranty(@PathVariable Long warrantyId) {
        Warranty warranty = warrantyService.getWarranty(warrantyId);
        return ResponseEntity.ok(warranty);
    }

    @GetMapping("/user/{userId}")
    @Operation(summary = "Get all warranties for a user")
    public ResponseEntity<List<Warranty>> getUserWarranties(@PathVariable Long userId) {
        List<Warranty> warranties = warrantyService.getUserWarranties(userId);
        return ResponseEntity.ok(warranties);
    }
}
