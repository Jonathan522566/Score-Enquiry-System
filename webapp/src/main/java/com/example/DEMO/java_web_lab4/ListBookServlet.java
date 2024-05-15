package com.example.DEMO.java_web_lab4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet(name = "ListBookServlet",value = "/ListBookServlet")
public class ListBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        Collection<Book> books=BookDB.getAll();
        out.write("本站的图书有:<br/>");
        for (Book book:books){
            String url="/webapp_war_exploded/PurchaseServlet?id="+book.getId();
            out.write(book.getName()+"<a href='"+url+"'>点击购买<a/><br>");//写到web.xml
        }
    }
}














