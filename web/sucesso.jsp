<%-- 
    Document   : sucesso
    Created on : 17/03/2017, 10:37:58
    Author     : 11151105952
--%>

<%@page import="modelo.Cliente"%>
<%@page import="static util.Constantes.*" %>
<% Cliente cli = (Cliente) request.getAttribute(ATRI_CLIENTE);%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso</title>
    </head>
    <body>
        <strong><font color="blue">O cliente <%= cli.getNome()%> foi cadastrado!</font></strong>
    </body>
</html>

