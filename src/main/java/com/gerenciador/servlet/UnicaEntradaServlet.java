package com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gerenciador.acoes.Alteracao;
import com.gerenciador.acoes.DeleteEmpresas;
import com.gerenciador.acoes.EditEmpresa;
import com.gerenciador.acoes.ListaEmpresas;
import com.gerenciador.acoes.NovaEmpresa;

@WebServlet(urlPatterns="/entrada")
public class UnicaEntradaServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        String paramAcao = req.getParameter("acao");

        if(paramAcao.equals("ListaEmpresas")){
            ListaEmpresas le = new ListaEmpresas();
            le.executa(req, resp);
        } else if(paramAcao.equals("RemoveEmpresas")){
            DeleteEmpresas de = new DeleteEmpresas();
            de.executa(req, resp);
        } else if(paramAcao.equals("MostraEmpresas")){
            Alteracao a = new Alteracao();
            a.executa(req, resp);
        } else if(paramAcao.equals("EditaEmpresas")){
            EditEmpresa ee = new EditEmpresa();
            ee.executa(req, resp);
        } else if(paramAcao.equals("NovaEmpresa")){
            NovaEmpresa ne = new NovaEmpresa();
            ne.executa(req, resp);
        }
    }    
}
