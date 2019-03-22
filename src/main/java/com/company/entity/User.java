package com.company.entity;

public class User {

    private final Long userId;
    private final String email;
    private final String password;

    public User(Long id, String email, String name) {
        this.userId = id;
        this.email = email;
        this.password = name;
    }

    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
