package com.gerenciador.acoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.modelo.Banco;
import com.gerenciador.modelo.Usuario;

public class Login implements Acao {
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco banco = new Banco();
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        Usuario usuario = banco.existeUsuario(login, senha);
        if(usuario!=null){
            return "redirect:entrada?acao=ListaEmpresas";
        }
        return "redirect:entrada?acao=LoginForm";
    }
}
