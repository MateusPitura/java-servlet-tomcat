package com.gerenciador.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gerenciador.modelo.Banco;
import com.gerenciador.modelo.Empresa;

@WebServlet(urlPatterns="/listaEmpresas")
public class ListaEmpresas extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        Banco banco = new Banco(); //instancia um objeto da classe Banco
        List<Empresa> lista = banco.getEmpresas(); //retorna uma lista de Empresas cadastrada no banco
        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
        req.setAttribute("lista", lista);
        rd.forward(req, resp);
    }
}
 