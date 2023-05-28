<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServlet"/>

<html>
    <head>
        <title>Formulario</title>
    </head>
    <body>
        <form action="${linkServlet}" method="post">
            Nome: <input type="text" name="nome"/>
            Data Abertura: <input type="text" name="data"/>
            <input type="submit"/>
        </form>
    </body>
</html>