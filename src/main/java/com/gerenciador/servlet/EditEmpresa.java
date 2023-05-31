package com.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gerenciador.modelo.Banco;

@WebServlet(urlPatterns="/editEmpresa")
public class EditEmpresa extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Banco banco = new Banco();
        String id = req.getParameter("id");
        Integer idEmpresa = Integer.valueOf(id);
        String nome = req.getParameter("nome");
        String data = req.getParameter("data");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAbertura = null;
        try{
            dataAbertura = sdf.parse(data);
        } catch(ParseException e){
            throw new ServletException(e);
        }
        banco.update(idEmpresa, nome, dataAbertura);
        resp.sendRedirect("listaEmpresas");
    }    
}
