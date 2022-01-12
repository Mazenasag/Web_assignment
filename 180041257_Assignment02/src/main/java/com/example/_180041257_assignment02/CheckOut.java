package com.example._180041257_assignment02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckOut extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>E-commorce Page</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<h2 color=\"blue\"> Checkout successful </h2>");
        out.println("Computer");
        out.println(" <br> ");
        out.println("Serial Number : AJ135");
        out.println(" <form method=\"post\" action=\"CartControllerServlet\"> ");
        out.println("Quantity : <input type=\"number\" name=\"priceMonitor\">");
        out.println(" <br>");
        out.println(" Price: 100$");
        out.println(" <br>");
        out.println(" <br>");
        out.println("  Mobile ");
        out.println(" <br>");
        out.println("Serial Number : AJ135 ");
        out.println(" <br>");
        out.println("  Quantity : <input type=\"number\" name=\"priceKeyboard\">");
        out.println(" <br>");
        out.println(" Price: 10$");
        out.println(" <br>");
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
