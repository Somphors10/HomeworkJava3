package com.example.demo.controller;


import com.example.demo.model.Student;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitSchoolForm")
public class SchoolFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String birthday = request.getParameter("birthday");
        boolean newStudent = request.getParameter("newStudent") != null;
        String favoriteColor = request.getParameter("favoriteColor");
        boolean terms = request.getParameter("terms") != null;

        // Create a Student object
        Student student = new Student(email, password, birthday, newStudent, favoriteColor, terms);

        // Save to database
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.saveStudent(student);

        // Forward to display.jsp
        request.setAttribute("student", student);
        request.getRequestDispatcher("display.jsp").forward(request, response);
    }
}