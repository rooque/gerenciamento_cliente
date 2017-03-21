/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.ClienteDAO;
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author 11151105952
 */
public class TesteListar {
    
    public static void main(String[] args) {
        ClienteDAO cdao = new ClienteDAO();
        ArrayList<Cliente> lc = cdao.listar();
        
        lc.forEach((c) -> {
            System.out.println(c.getNome());
        });
        
        
    }
}
