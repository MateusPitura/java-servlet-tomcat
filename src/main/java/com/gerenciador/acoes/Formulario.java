package com.gerenciador.acoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Formulario implements Acao{
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        return "forward:formulario.jsp";
    }
}
