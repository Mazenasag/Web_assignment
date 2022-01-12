package com.example._180041257_assignment02;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        String user = null;

        if (cookies == null) {
            response.sendRedirect("Login.html");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("currentUser")) {
                    user = cookie.getValue();
                }
            }
        }

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>E-commorce Page</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<h4> Please enter the desired quantity for your products </h4>");
        out.println("<h2>Welcome, " + user + "</h2>");
        out.println(" Monitor ");
        out.println("<br>");
        out.println(" Serial Number : IQ234 ");
        out.println("<form method=\"post\" action=\"CartControllerServlet\"> ");
        out.println(" Quantity : <input type=\"number\" name=\"priceMonitor\">");
        out.println("<br>");
        out.println("Price: 100$");
        out.println("<br>");
        out.println("<br>");
        out.println(" Keyboard ");
        out.println("<br>");
        out.println(" Serial Number : IQ2344 ");
        out.println("<br>");
        out.println(" Quantity : <input type=\"number\" name=\"priceKeyboard\">");
        out.println("<br>");
        out.println("Price: 10$");
        out.println("<br>");
        out.println("<br>");
        out.println("<input type=\"submit\" value=\"Add to Cart\">");
        out.println("</form>");
        out.println("<form method = \"post\" action=\"LogoutServlet\"> <input type=\"submit\" value = \"Log Out\"> </form>");
        out.println("</BODY>");
        out.println("</HTML>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
