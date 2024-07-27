package com.electra.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/submit_address")
public class AddressServlet extends HttpServlet {
    private String message;

    public void init() {
        System.out.println("--------------- inside the init() method ---------------");
        message = "Hello Users!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("--------------- inside the doGet() method ---------------");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("--------------- inside the service() method ---------------");
        this.doGet(request, response);
    }

    public void destroy() {
        System.out.println("--------------- inside the destroy() method ---------------");
    }




}

