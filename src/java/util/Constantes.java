/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author rooque
 */
public final class Constantes {

    // JSP
    public final static String JSP_SUCESSO = "sucesso.jsp";
    public final static String JSP_ERRO = "erro.jsp";
    public final static String JSP_LISTA = "listaCliente.jsp";

    //ACAO
    public final static String ACAO_CADASTRAR = "Cadastrar";
    public final static String ACAO_LISTAR = "Listar";

    // PARAMETER & ATRI
    public final static String PARAMETER_ACAO = "acao";
    public final static String PARAMETER_NOME = "txtNome";
    public final static String PARAMETER_CPF = "txtCpf";
    public final static String PARAMETER_TEL = "txtTelefone";
    public final static String PARAMETER_ENDE = "txtEndereco";
    public final static String ATRI_CLIENTE = "cliente";
    public final static String ATRI_ERRO = "erro";
    public final static String ATRI_LISTA = "lista";

    // Cliente 
    public final static String ID = "id";
    public final static String CPF = "cpf";
    public final static String NOME = "nome";
    public final static String ENDE = "endereco";
    public final static String TEL = "telefone";

    // SQL
    public static final String INSERT = "INSERT into cliente(nome,cpf,telefone,endereco) VALUES (?,?,?,?)";
    public static final String SELECT_ALL = "SELECT * FROM cliente";

    // CONEXAO
    public static final String PSQL_IP = "localhost";
    public static final String PSQL_PORT = "5432";
    public static final String PSQL_DB = "adcli";
    public static final String PSQL_USER = "postgres";
    public static final String PSQL_PASS = "postgres";

}
