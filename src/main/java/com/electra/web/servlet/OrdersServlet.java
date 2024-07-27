package com.electra.web.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class OrdersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productId = request.getParameter("product_id");
        String customerId = request.getParameter("customer_id");
        String orderDate = request.getParameter("order_date");

        // Process the data (e.g., save to database)
        // ...

        response.getWriter().println("Order submitted successfully!");
    }
}
