/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.ClienteDAO;
import modelo.Cliente;

/**
 *
 * @author 11151105952
 */
public class CadastraCliente {
    public static void main(String[] args) {
        
        Cliente c = new Cliente("AFF","123","456","789");
        
        ClienteDAO cdao = new ClienteDAO();
        cdao.cadastrar(c);
        
    }
    
}
