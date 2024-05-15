package com.example.DEMO.java_web_lab3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RequsetForwardServlet",value = "/RequsetForwardServlet")
public class RequestForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html;charset=utf-8");

        request.setAttribute("school","seig");
        RequestDispatcher dispatcher=request.getRequestDispatcher("/ResultServlet");
        dispatcher.forward(request,response);

    }
}
