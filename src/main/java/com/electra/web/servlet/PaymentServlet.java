package com.electra.web.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class PaymentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amount = request.getParameter("amount");
        String paymentDate = request.getParameter("payment_date");
        String customerId = request.getParameter("customer_id");
        String orderId = request.getParameter("order_id");

        // Process the data (e.g., save to database)
        // ...

        response.getWriter().println("Payment submitted successfully!");
    }
}
