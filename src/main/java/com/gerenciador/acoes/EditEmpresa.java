package com.gerenciador.acoes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.modelo.Banco;


public class EditEmpresa implements Acao{

    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
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
        return "redirect:entrada?acao=ListaEmpresas";
    }
}
