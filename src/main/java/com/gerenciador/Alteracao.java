package com.gerenciador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/alteracao")
public class Alteracao extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Banco banco = new Banco();
        String id = req.getParameter("id");
        Integer idEmpresa = Integer.valueOf(id);
        Empresa empresa = banco.getEmpresa(idEmpresa);
        RequestDispatcher rd = req.getRequestDispatcher("/alteracao.jsp");
        req.setAttribute("id", idEmpresa);
        req.setAttribute("nome", empresa.getNome());
        req.setAttribute("data", empresa.getDataAbertura());
        rd.forward(req, resp);
    }    
}
