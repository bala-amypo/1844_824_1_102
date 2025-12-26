package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // 1. Tells Spring to manage this class
@ConfigurationProperties(prefix = "jwt") // 2. Optional: Maps properties like jwt.secret in application.properties
public class JwtProperties {

    private String secret = "default_secret_key_change_me_in_production";
    private Long expirationMs = 3600000L; // Default 1 hour

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getExpirationMs() {
        return expirationMs;
    }

    public void setExpirationMs(Long expirationMs) {
        this.expirationMs = expirationMs;
    }
}