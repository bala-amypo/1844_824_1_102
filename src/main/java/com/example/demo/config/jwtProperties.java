package com.example.demo.config;
import lombok.Getter;
import lombok.setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.annotation.ConfigurationProperties;
public class jwtProperties {
    private String secret;
    private Long expirationMs;
}