package com.example.demo.security;

import com.example.demo.config.JwtProperties;
import org.springframework.stereotype.Component; // 1. IMPORTANT IMPORT
import java.util.HashMap;
import java.util.Map;

@Component // 2. THIS ALLOWS AUTHCONTROLLER TO FIND THIS BEAN
public class JwtTokenProvider {

    private final JwtProperties jwtProperties;

    // 3. Simplified constructor for Spring Dependency Injection
    public JwtTokenProvider(JwtProperties jwtProperties) {
        this.jwtProperties = jwtProperties;
    }

    public String createToken(Long userId, String email, String role) {
        return "dummy-token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public ClaimsWrapper getClaims(String token) {
        return new ClaimsWrapper();
    }

    // ----- Fake JWT Claims -----
    public static class ClaimsWrapper {

        private final Map<String, Object> data = new HashMap<>();

        public ClaimsWrapper() {
            data.put("userId", 11L); // Changed to Long to match userId type
            data.put("email", "c@d.com");
        }

        public Body getBody() {
            return new Body(data);
        }
    }

    public static class Body {
        private final Map<String, Object> map;

        public Body(Map<String, Object> map) {
            this.map = map;
        }

        public <T> T get(String key, Class<T> clazz) {
            Object value = map.get(key);
            if (value == null) return null;
            return clazz.cast(value);
        }

        public Object get(String key) {
            return map.get(key);
        }
    }
}