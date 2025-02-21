package com.example.demo.dao;

public class Student {
    private String email;
    private String password;
    private String birthday;
    private boolean newStudent;
    private String favoriteColor;
    private boolean terms;

    // Getters and Setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public boolean isNewStudent() { return newStudent; }
    public void setNewStudent(boolean newStudent) { this.newStudent = newStudent; }

    public String getFavoriteColor() { return favoriteColor; }
    public void setFavoriteColor(String favoriteColor) { this.favoriteColor = favoriteColor; }

    public boolean isTerms() { return terms; }
    public void setTerms(boolean terms) { this.terms = terms; }
}
