<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.gerenciador.Empresa"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <body>
        Lista de empresas: <br />
        <ul>
            <c:forEach items="${lista}" var="empresa">
                <li>${empresa.nome}</li>
            </c:forEach>
        </ul>
    </body>
</html>