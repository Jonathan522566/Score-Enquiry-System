package com.example.DEMO.java_web_lab4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name="CarServlet",value = "/CarServlet")
public class CarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        List<Book> cart=null;
        boolean purFlag=true;
        HttpSession session=requset.getSession(false);

        if (session==null){
            purFlag=false;
        }else{
            cart=(List)session.getAttribute("cart");
            if(cart==null){
                purFlag=false;
            }
        }

        if (!purFlag){
            out.write("对不起，您没有购买任何产品！<br>");
        }else{
            out.write("您购买的图书有:<br>");
            for (Book book:cart){
                out.write(book.getName()+"<br>");
            }
        }

    }
}
