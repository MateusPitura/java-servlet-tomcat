package com.gerenciador.acoes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.modelo.Banco;
import com.gerenciador.modelo.Empresa;

public class NovaEmpresa {
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Banco banco = new Banco(); //instancia um objeto da classe Banco
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
        return "redirect:entrada?acao=ListaEmpresas";
    }
}
