package com.example._180041257_assignment02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginPageServlet extends HttpServlet {

    private final String name = "Mazen";
    private final String password = "123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username-field");
        String pw = request.getParameter("pw-field");

        if (username.equals(name) && pw.equals(password)) {
            Cookie usernameCookie = new Cookie("currentUser", username);
            usernameCookie.setMaxAge(30 * 60);
            response.addCookie(usernameCookie);

            RequestDispatcher rd = request.getRequestDispatcher("ProductPageServlet");
            rd.forward(request, response);

        } else {

            response.sendRedirect("Login.html");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
