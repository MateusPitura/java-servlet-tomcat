<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.gerenciador.modelo.Empresa"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada?acao=RemoveEmpresas" var="deleteServlet"/>
<c:url value="/entrada?acao=Alteracao" var="alteracaoServlet"/>

<html>
    <body>
        Usuario logado: ${usuarioLogado.login}
        <br>
        <br>
        <c:if test="${not empty empresa}">
            Empresa ${ empresa } cadastrada
        </c:if>
        Lista de empresas: <br />
        <ul>
            <c:forEach items="${lista}" var="empresa">
                <li>
                    ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
                    <a href="${deleteServlet}&id=${empresa.id}">delete</a>
                    <a href="${alteracaoServlet}&id=${empresa.id}">edit</a>   
                </li>
            </c:forEach>
        </ul>
    </body>
</html>