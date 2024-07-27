package com.electra.web.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SupplierServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String contactInfo = request.getParameter("contact_info");
        String addressId = request.getParameter("address_id");

        // Process the data (e.g., save to database)
        // ...

        response.getWriter().println("Supplier submitted successfully!");
    }
}
