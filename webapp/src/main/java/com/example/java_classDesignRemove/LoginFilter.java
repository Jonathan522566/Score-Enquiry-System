package com.example.java_classDesignRemove;

import com.sun.net.httpserver.HttpExchange;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.dsig.spec.XPathType;
import java.io.File;
import java.io.IOException;

//LoginFilter过滤器，过滤DealWithServlet
@WebFilter(filterName = "LoginFilter",value = "/DealWithServlet")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        String uri=req.getRequestURI(); //获取资源路经

        //判断是否包含登录相关路劲信息
        if (uri.contains("/Login.html")||uri.contains("/LoginServlet")){
            chain.doFilter(request,response);//包含 //登录-
        }else {
            //不包含，需要用户验证是否登录，从session中获取account
            Object user=req.getSession().getAttribute("account");
            if (user!=null){
                chain.doFilter(request,response);//登录-
            }else {
                //没有登录
                request.getRequestDispatcher("/Login.html").forward(request,response);
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init....");
    }

    @Override
    public void destroy() {

    }
}




