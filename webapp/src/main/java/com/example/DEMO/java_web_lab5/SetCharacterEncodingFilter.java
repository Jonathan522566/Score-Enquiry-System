package com.example.DEMO.java_web_lab5;

import javax.servlet.*;
import javax.servlet.Filter;
import java.io.IOException;

public class SetCharacterEncodingFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
