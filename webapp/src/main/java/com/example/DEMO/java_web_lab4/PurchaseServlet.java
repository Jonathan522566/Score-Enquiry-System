package com.example.DEMO.java_web_lab4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PurchaseServlet",value = "/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");   //获得输入网页表单的值(书号)
        if (id==null){
            String url="/webapp_war_exploded/ListBookServlet";//回到最初页面，因为没有这本书
            response.sendRedirect(url);   //重定向
            return;
        }

        Book book=BookDB.getBook(id);
        HttpSession session=request.getSession();
        List<Book> cart=(List)session.getAttribute("cart");
        if (cart==null){
            cart=new ArrayList<Book>();
            session.setAttribute("cart",cart);
        }

        cart.add(book);
        Cookie cookie=new Cookie("JSESSIONID",session.getId());
        cookie.setMaxAge(60*30);
        cookie.setPath("/");
        response.addCookie(cookie);
        String url="/webapp_war_exploded/CarServlet";
        response.sendRedirect(url);

    }
}









