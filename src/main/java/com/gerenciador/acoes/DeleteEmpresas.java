package com.gerenciador.acoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.modelo.Banco;

public class DeleteEmpresas implements Acao{
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Banco banco = new Banco();
        String id = req.getParameter("id");
        Integer idEmpresa = Integer.valueOf(id);
        banco.remove(idEmpresa);
        return "redirect:entrada?acao=ListaEmpresas";
    }
}
