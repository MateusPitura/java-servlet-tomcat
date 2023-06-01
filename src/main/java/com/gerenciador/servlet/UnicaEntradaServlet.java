package com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.acoes.Alteracao;
import com.gerenciador.acoes.DeleteEmpresas;
import com.gerenciador.acoes.EditEmpresa;
import com.gerenciador.acoes.Formulario;
import com.gerenciador.acoes.ListaEmpresas;
import com.gerenciador.acoes.NovaEmpresa;

@WebServlet(urlPatterns="/entrada")
public class UnicaEntradaServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        String paramAcao = req.getParameter("acao");

        String nome = null;

        if(paramAcao.equals("ListaEmpresas")){
            ListaEmpresas le = new ListaEmpresas();
            nome = le.executa(req, resp);
        } else if(paramAcao.equals("RemoveEmpresas")){
            DeleteEmpresas de = new DeleteEmpresas();
            nome = de.executa(req, resp);
        } else if(paramAcao.equals("MostraEmpresas")){
            Alteracao a = new Alteracao();
            nome = a.executa(req, resp);
        } else if(paramAcao.equals("EditaEmpresas")){
            EditEmpresa ee = new EditEmpresa();
            nome = ee.executa(req, resp);
        } else if(paramAcao.equals("NovaEmpresa")){
            NovaEmpresa ne = new NovaEmpresa();
            nome = ne.executa(req, resp);
        } else if(paramAcao.equals("Formulario")){
            Formulario f = new Formulario();
            nome = f.executa(req, resp);
        }

        String[] tipoEndereco = nome.split(":");
        
        if(tipoEndereco[0].equals("forward")){
            RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
            rd.forward(req, resp);
        } else if(tipoEndereco[0].equals("redirect")){
            resp.sendRedirect(tipoEndereco[1]);
        }
    }    
}
