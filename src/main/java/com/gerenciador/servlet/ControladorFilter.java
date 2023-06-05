package com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gerenciador.acoes.Acao;

public class ControladorFilter implements Filter {
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

        String nomeDaClasse = "com.gerenciador.acoes." + paramAcao;

        Object obj;
        try {
            Class classe = Class.forName(nomeDaClasse);
            obj = classe.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new ServletException(e);
        };
        Acao acao = (Acao)obj;
        String nome = acao.executa(req, resp);

        String[] tipoEndereco = nome.split(":");
        
        if(tipoEndereco[0].equals("forward")){
            RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
            rd.forward(req, resp);
        } else if(tipoEndereco[0].equals("redirect")){
            resp.sendRedirect(tipoEndereco[1]);
        }
    }
}
