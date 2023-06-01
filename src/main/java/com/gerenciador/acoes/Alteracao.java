package com.gerenciador.acoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.modelo.Banco;
import com.gerenciador.modelo.Empresa;

public class Alteracao {
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Banco banco = new Banco();
        String id = req.getParameter("id");
        Integer idEmpresa = Integer.valueOf(id);
        Empresa empresa = banco.getEmpresa(idEmpresa);
        req.setAttribute("id", idEmpresa);
        req.setAttribute("nome", empresa.getNome());
        req.setAttribute("data", empresa.getDataAbertura());
        return "forward:alteracao.jsp";
    }
}
