<%-- 
    Document   : listaCliente
    Created on : 17/03/2017, 10:37:47
    Author     : 11151105952
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Cliente"%>
<%@page import="static util.Constantes.*" %>
<% ArrayList<Cliente> lc = (ArrayList<Cliente>) request.getAttribute(ATRI_LISTA); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
    </head>
    <body>
        <h1>Lista</h1>
        <table border="1">
            <thead>
            <th>ID</th>
            <th>Nome</th>
            <th>Telefone</th>
            <th>Atualizar</th>
            <th>Excluir</th>
        </thead>
        <tbody>
            <%
                for (Cliente c : lc) {
            %>
            
                <td><%= c.getId()%></td>
                <td><%= c.getNome()%></td>
                <td><%= c.getTel()%></td>
                <% //TODO: Implementar Atualizar e Excluir Cliente %>
                <td><a href="Controle?id=<%= c.getId()%>">[x]</a></td>
                <td><a href="Controle?id=<%= c.getId()%>">[x]</a></td>
            
            <% }%>
        </tbody>
    </table>
</body>
</html>
