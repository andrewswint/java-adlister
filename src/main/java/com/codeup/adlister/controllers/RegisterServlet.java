package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        // TODO: show the registration form
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp");
        List<String> errors = new ArrayList<>();
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        // TODO: ensure the submitted information is valid
        if (password == null || username == null || email == null) {
            response.sendRedirect("/register?error=null");
        } else if (password.equalsIgnoreCase("") || username.equalsIgnoreCase("") || email.equalsIgnoreCase("")) {
            response.sendRedirect("/register?error=empty");
        } else {
        // TODO: create a new user based off of the submitted information
            User user = new User(username, email, password);
            DaoFactory.getUsersDao().insert(user);
        // TODO: if a user was successfully created, send them to their profile
            response.sendRedirect("/profile");
        }

    }
}
