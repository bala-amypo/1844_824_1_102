package com.example.demo.entity;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;

    public User() {}

    public User(Long id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // ===== BUILDER =====
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final User u = new User();

        public Builder id(Long id) { u.setId(id); return this; }
        public Builder name(String name) { u.setName(name); return this; }
        public Builder email(String email) { u.setEmail(email); return this; }
        public Builder password(String password) { u.setPassword(password); return this; }
        public Builder role(String role) { u.setRole(role); return this; }

        public User build() { return u; }
    }

    // ===== GETTERS & SETTERS =====
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
