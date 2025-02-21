package com.example.demo.controller;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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