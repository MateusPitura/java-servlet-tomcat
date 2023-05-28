<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.gerenciador.Empresa"%> 

<html>
    <body>
        Lista de empresas: <br />
        <ul>
        <%
            List<Empresa> lista = (List<Empresa>)request.getAttribute("lista");
            for (Empresa empresa : lista) {
        %>
            <li><%= empresa.getNome() %></li>
        <%
            }
        %>
        </ul>
    
    </body>
</html>