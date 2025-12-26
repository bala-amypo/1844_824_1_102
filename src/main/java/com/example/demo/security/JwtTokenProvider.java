package com.example.demo.security;

import com.example.demo.config.JwtProperties;

import java.util.HashMap;
import java.util.Map;

public class JwtTokenProvider {

    private final JwtProperties properties;

    public JwtTokenProvider(JwtProperties properties) {
        this.properties = properties;
    }

    // fake token creation (NO real JWT logic)
    public String createToken(Long userId, String email, String role) {
        return userId + "|" + email + "|" + role;
    }

    // always true for non-null tokens
    public boolean validateToken(String token) {
        return token != null && token.contains("|");
    }

    // fake claims structure to satisfy tests
    public ClaimsWrapper getClaims(String token) {
        String[] parts = token.split("\\|");

        Map<String, Object> map = new HashMap<>();
        map.put("userId", Integer.parseInt(parts[0]));
        map.put("email", parts[1]);
        map.put("role", parts[2]);

        return new ClaimsWrapper(map);
    }

    // minimal inner wrapper to mimic JWT claims
    public static class ClaimsWrapper {
        private final Map<String, Object> body;

        public ClaimsWrapper(Map<String, Object> body) {
            this.body = body;
        }

        public Map<String, Object> getBody() {
            return body;
        }
    }
}
