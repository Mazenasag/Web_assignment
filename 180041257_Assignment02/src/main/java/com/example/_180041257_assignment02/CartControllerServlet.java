package com.example._180041257_assignment02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CartControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int Monitor = Integer.parseInt(request.getParameter("priceMonitor"));
        int Keyboard = Integer.parseInt(request.getParameter("priceKeyboard"));

        int singlePriceMonitor = 100;
        int singlePriceKeyboard = 10;

        int totalPriceMonitor = singlePriceMonitor * Monitor;
        int totalPriceKeyboard = singlePriceKeyboard * Keyboard;

        int totalPriceMonitorAndKeyboard = totalPriceMonitor + totalPriceKeyboard;

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Ecommorce Page</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println(" Monitor ");
        out.println("Monitor Selected: " + Monitor);
        out.println("<br>");
        out.println("Total price of Monitor: " + totalPriceMonitor + "$");
        out.println("<br>");
        out.println("Keyboard Selected: " + Keyboard);
        out.println("<br>");
        out.println("Total price of Keyboard: " + totalPriceKeyboard + "$");
        out.println("<br>");
        out.println("<br>");
        out.println("Total price: " + totalPriceMonitorAndKeyboard + "$");
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"ProductPageServlet\"> ");
        out.println("<input type=\"submit\" value=\"Update Cart\">");
        out.println("</form>");
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"CheckOut\"> ");
        out.println("<input type=\"submit\" value=\"Check Out\">");
        out.println("</BODY>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
