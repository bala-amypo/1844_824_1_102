package com.example.demo.security;

import com.example.demo.config.JwtProperties;
import java.util.HashMap;
import java.util.Map;

public class JwtTokenProvider {

    public JwtTokenProvider() {}

    public JwtTokenProvider(JwtProperties props) {}

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
            data.put("userId", 11);
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
            return clazz.cast(map.get(key));
        }

        public Object get(String key) {
            return map.get(key);
        }
    }
}
