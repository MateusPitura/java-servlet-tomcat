package com.gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/deleteEmpresa")
public class DeleteEmpresa extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Banco banco = new Banco();
        String id = req.getParameter("id");
        Integer idEmpresa = Integer.valueOf(id);
        banco.remove(idEmpresa);
        resp.sendRedirect("listaEmpresas");
    }    
}
