<%-- 
    Document   : index
    Created on : 17/03/2017, 10:37:26
    Author     : 11151105952
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestão Clientes</title>
    </head>
    <h1>Cadastro de Clientes</h1>
    <body>
        <form action="ControleCliente" method="post">
            Nome:     <input type="text" name="txtNome"><br>
            CPF:      <input type="text" name="txtCpf"><br>
            Telefone: <input type="text" name="txtTelefone"><br>
            Endereço: <input type="text" name="txtEndereco"><br>
            <input type="submit" name="acao" value="Cadastrar">
            <input type="submit" name="acao" value="Listar">
        </form>
    </body>
</html>

