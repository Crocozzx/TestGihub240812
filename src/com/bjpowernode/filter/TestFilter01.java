package com.bjpowernode.filter;

import com.sun.deploy.net.HttpResponse;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebFilter(urlPatterns = {"/index.jsp","/TestServlet01"})
public class TestFilter01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse)servletResponse;
        PrintWriter writer = resp.getWriter();
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        //filterChain.doFilter(req,resp);
        //resp.getWriter().print("skjdfklasdjfl");
        //req.getRequestDispatcher("TestServlet01").forward(req,resp);
        //dev分支添加的
        System.out.println("dev分支添加的");
        System.out.println("master 添加了");
    }

    @Override
    public void destroy() {

    }
}
