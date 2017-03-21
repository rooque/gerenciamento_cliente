<%-- 
    Document   : erro
    Created on : 17/03/2017, 10:37:33
    Author     : 11151105952
--%>
<%@page import="static util.Constantes.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Erro!</h2>

        <%
            Exception erro = (Exception) request.getAttribute(ATRI_ERRO);
        %>
        <%=erro.getMessage()%>
    </body>
</html>

