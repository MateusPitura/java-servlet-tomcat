package com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(urlPatterns = "/entrada")
public class AutorizacaoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void destroy() {
        
        
    }
    @Override
    public void doFilter(ServletRequest servletReq, ServletResponse servletResp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletReq;
        HttpServletResponse resp = (HttpServletResponse)servletResp;
        String paramAcao = req.getParameter("acao");
        HttpSession sessao = req.getSession();
        boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
        boolean ehUmaAcaoProtegida = (paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
        if(usuarioNaoEstaLogado && !ehUmaAcaoProtegida){
            resp.sendRedirect("entrada?acao=LoginForm");
            return;
        }
        chain.doFilter(req, resp);
    }
}
