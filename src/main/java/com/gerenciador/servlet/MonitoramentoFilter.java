package com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void destroy() {
        
        
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        long antes = System.currentTimeMillis();
        String action = req.getParameter("acao");
        chain.doFilter(req, resp);
        long depois = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (depois-antes) + " Ação: " + action);
    }
}
