<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada?acao=Login" var="linkServlet"/>

<html>
    <head>
        <title>Formulario</title>
    </head>
    <body>
        <form action="${linkServlet}" method="post">
            Login: <input type="text" name="login"/>
            Senha: <input type="password" name="senha"/>
            <input type="submit"/>
        </form>
    </body>
</html>