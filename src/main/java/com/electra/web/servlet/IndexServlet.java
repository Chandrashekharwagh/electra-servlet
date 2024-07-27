package com.electra.web.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // Initialization code
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET request
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Welcome to the Entity Management System</h1>");
        response.getWriter().println("<p>Select a form to manage the respective entity:</p>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li><a href='address_form.html'>Address Form</a></li>");
        response.getWriter().println("<li><a href='brand_form.html'>Brand Form</a></li>");
        response.getWriter().println("<li><a href='supplier_form.html'>Supplier Form</a></li>");
        response.getWriter().println("<li><a href='product_form.html'>Product Form</a></li>");
        response.getWriter().println("<li><a href='customer_form.html'>Customer Form</a></li>");
        response.getWriter().println("<li><a href='orders_form.html'>Orders Form</a></li>");
        response.getWriter().println("<li><a href='payment_form.html'>Payment Form</a></li>");
        response.getWriter().println("</ul>");
        response.getWriter().println("</body></html>");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        // Service method code
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle DELETE request
    }

    @Override
    public void destroy() {
        // Cleanup code
    }
}
