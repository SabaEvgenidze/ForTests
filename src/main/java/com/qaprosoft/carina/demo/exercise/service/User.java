package com.qaprosoft.carina.demo.exercise.service;

public class User {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
