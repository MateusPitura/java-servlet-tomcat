package com.gerenciador.acoes;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.modelo.Banco;
import com.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao{

    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Banco banco = new Banco(); //instancia um objeto da classe Banco
        List<Empresa> lista = banco.getEmpresas(); //retorna uma lista de Empresas cadastrada no banco
        req.setAttribute("lista", lista);
        return "forward:listaEmpresas.jsp";
    }
}
