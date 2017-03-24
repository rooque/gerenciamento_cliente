<%-- 
    Document   : alterarCliente
    Created on : 22/03/2017, 13:29:56
    Author     : Agencia-03
--%>
<%@page import="modelo.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="static util.Constantes.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>alterar cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <meta charset="UTF-8">  
    </head>
    <body>
        
         <% 
        
        //recuperar a lista do request
       ArrayList<Cliente> consultaCliente = (ArrayList<Cliente>) request.getAttribute(ATRI_CONSULTA);
           
        %>
        
        <% 
                for(Cliente cliente: consultaCliente){
                       
        %>
        
        <div class="container">
        <h1 style="text-align: center;">ALTERAR CLIENTE</h1>
        <form action="ControleCliente" method="POST">
            Id: <input type="text" name="txtId" value="<%= cliente.getId() %>"><br/>
            Nome: <input type="text" name="txtNome" value="<%= cliente.getNome() %>"><br/>
            Telefone: <input type="text" name="txtTelefone" value="<%= cliente.getTel() %>"><br/>
            Endereço: <input type="text" name="txtEndereco" value="<%= cliente.getEnde() %>"><br/>
            <input type="submit" name="acao" value="<%= ACAO_ALTERAR %>">
           
            
            
            <% }; %> 
            
            
            
        </form>
    </div>
    </body>
</html>