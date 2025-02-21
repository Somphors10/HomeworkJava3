package com.example.demo.model;

public class Student {
    private String email;
    private String password;
    private String birthday;
    private boolean newStudent;
    private String favoriteColor;
    private boolean terms;

    // Constructor, getters, and setters
    public Student(String email, String password, String birthday, boolean newStudent, String favoriteColor, boolean terms) {
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.newStudent = newStudent;
        this.favoriteColor = favoriteColor;
        this.terms = terms;
    }

    // Add getters and setters for all fields
}