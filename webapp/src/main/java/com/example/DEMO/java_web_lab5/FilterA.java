package com.example.DEMO.java_web_lab5;

import javax.servlet.*;
import java.io.IOException;

public class FilterA implements Filter {
    public void destroy() {
        System.out.println("filterA destroy....");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterA dofilter.....");
        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filterA init....");
    }

}
