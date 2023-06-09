<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada?acao=EditEmpresa" var="linkServlet"/>

<html>
    <c:import url="logout-parcial.jsp"/>
    <head>
        <title>Formulario</title>
    </head>
    <body>
        <form action="${linkServlet}&id=${id}" method="post">
            Nome: <input type="text" value="${nome}" name="nome"/>
            Data Abertura: <input type="text" value=<fmt:formatDate value="${data}" pattern="dd/MM/yyyy"/> name="data"/>
            <input type="submit"/>
        </form>
    </body>
</html>