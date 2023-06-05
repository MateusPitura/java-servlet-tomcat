package com.gerenciador.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gerenciador.modelo.Banco;
import com.gerenciador.modelo.Empresa;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

@WebServlet(urlPatterns = "/empresas")
public class EmpresasService extends HttpServlet  {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        Banco banco = new Banco();
        List<Empresa> empresas = banco.getEmpresas();

        String valor = req.getHeader("Accept");
        System.out.println(valor);

        if(valor.equals("application/xml")){
            XStream xStream = new XStream();
            xStream.alias("empresa", Empresa.class);
            String xml = xStream.toXML(empresas);
            resp.setContentType("application/xml");
            resp.getWriter().print(xml);
        } else if(valor.equals("application/json")){
            Gson gson = new Gson();
            String json = gson.toJson(empresas);
            resp.setContentType("application/json");
            resp.getWriter().print(json);   
        } else{
            resp.setContentType("application/json");
            resp.getWriter().print("{'message':'no content')}");   
        }
    }
}
