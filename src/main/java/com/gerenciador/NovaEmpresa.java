package com.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresa extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        Banco banco = new Banco(); //instancia um objeto da classe Banco
        PrintWriter out = resp.getWriter(); //retorna um objeto que permite escrita
        String nomeEmpresa = req.getParameter("nome"); //retorna uma string com o valor do parâmetro informado na url
        String dataEmpresa = req.getParameter("data");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAbertura = null;
        try{
            dataAbertura = sdf.parse(dataEmpresa);
        } catch(ParseException e){
            throw new ServletException(e);
        }
        Empresa empresa = new Empresa(nomeEmpresa, dataAbertura); //instancia uma nova empresa com a string informada no parâmetro
        banco.adiciona(empresa); //adiciona uma nova empresa no banco
        RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCriada.jsp");
        req.setAttribute("empresa", empresa.getNome());
        rd.forward(req, resp);
    }
}
