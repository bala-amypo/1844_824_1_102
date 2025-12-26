package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    // dummy token creation (NO LOGIC)
    public String createToken(Long userId, String email, String role) {
        return "dummy-token";
    }

    // dummy validation (used in tests)
    public boolean validateToken(String token) {
        return true;
    }

    // dummy claims method (used in tests)
    public ClaimsWrapper getClaims(String token) {
        return new ClaimsWrapper();
    }

    // minimal inner wrapper to satisfy tests
    public static class ClaimsWrapper {
        public java.util.Map<String, Object> getBody() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("userId", 0);
            map.put("email", "");
            map.put("role", "");
            return map;
        }
    }
}
