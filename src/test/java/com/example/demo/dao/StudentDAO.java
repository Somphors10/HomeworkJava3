package com.example.demo.dao;

import com.example.demo.model.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public void saveStudent(Student student) {
        String sql = "INSERT INTO students (email, password, birthday, new_student, favorite_color, terms) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getEmail());
            stmt.setString(2, student.getPassword());
            stmt.setString(3, student.getBirthday());
            stmt.setBoolean(4, student.isNewStudent());
            stmt.setString(5, student.getFavoriteColor());
            stmt.setBoolean(6, student.isTerms());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}