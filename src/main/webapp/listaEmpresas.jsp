<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.gerenciador.Empresa"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
    <body>
        <c:if test="${not empty empresa}">
            Empresa ${ empresa } cadastrada
        </c:if>
        Lista de empresas: <br />
        <ul>
            <c:forEach items="${lista}" var="empresa">
                <li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/></li>
            </c:forEach>
        </ul>
    </body>
</html>