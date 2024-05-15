package com.example.DEMO.java_web_lab5;

import javax.servlet.*;
import java.io.IOException;

public class FilterB implements Filter {
    public void destroy() {
        System.out.println("filterB destroy...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterB dofilter....");
        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filterB init.....");

    }

}
