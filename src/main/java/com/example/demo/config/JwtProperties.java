package com.example.demo.config;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class JwtProperties {
    // These names must match the strings in Test suite reflection calls
    private String secret = "12345678901234567890123456789012"; 
    private Long expirationMs = 3600000L;
}