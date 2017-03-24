/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import static util.Constantes.*;

/**
 *
 * @author 11151105952
 */
public class ControleCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        ClienteDAO cdao = new ClienteDAO();

        try {
            String acao = request.getParameter(PARAMETER_ACAO);

            if (acao.equals(ACAO_CADASTRAR)) {

                String nome = request.getParameter(PARAMETER_NOME);
                String cpf = request.getParameter(PARAMETER_CPF);
                String tel = request.getParameter(PARAMETER_TEL);
                String ende = request.getParameter(PARAMETER_ENDE);

                Cliente c = new Cliente(nome, cpf, tel, ende);

                cdao.cadastrar(c);

                rd = request.getRequestDispatcher(JSP_SUCESSO);
                request.setAttribute(ATRI_CLIENTE, c);
                rd.forward(request, response);

            } else if (acao.equals(ACAO_LISTAR)) {

                ArrayList<Cliente> lc = cdao.listar();
                rd = request.getRequestDispatcher(JSP_LISTA);
                request.setAttribute(ATRI_LISTA, lc);
                rd.forward(request, response);

            } else if (acao.equals(ACAO_DELETAR)) {

                int id = Integer.parseInt(request.getParameter(ID));

                Cliente cliente = new Cliente();
                cliente.setId(id);

                cdao.Excluir(cliente);
                
                PrintWriter out = response.getWriter();

                out.println("Cliente EXCLUIDO ");

            } else if (acao.equals(ACAO_CONSULTAR)) {
                int id = Integer.parseInt(request.getParameter(ID));
                Cliente cliente = new Cliente();
                cliente.setId(id);

                ArrayList<Cliente> consultarCliente = cdao.Consultar(cliente);

                request.setAttribute(ATRI_CONSULTA, consultarCliente);

                rd = request.getRequestDispatcher(JSP_ALTERAR);
                //quem vai acionar toda essa ação é o forward
                rd.forward(request, response);
            } else if (acao.equals(ACAO_ALTERAR)) {
                System.out.println("TESTE");
                int id = Integer.parseInt(request.getParameter("txtId"));
                String nome = request.getParameter(PARAMETER_NOME);
                String telefone = request.getParameter(PARAMETER_TEL);
                String endereco = request.getParameter(PARAMETER_ENDE);

                Cliente cliente = new Cliente();
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setTel(telefone);
                cliente.setEnde(endereco);

                cdao.Alterar(cliente);

                PrintWriter out = response.getWriter();

                out.println("Cliente ALTERADO ");
            } else {
                throw new IllegalAccessException();
            }
        } catch (Exception e) {
            request.setAttribute(ATRI_ERRO, e);
            rd = request.getRequestDispatcher(JSP_ERRO);
            rd.forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
