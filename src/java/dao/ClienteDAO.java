/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import util.ConectaBanco;
import static util.Constantes.*;

/**
 *
 * @author 11151105952
 */
public class ClienteDAO {

    public void cadastrar(Cliente c) {
        Connection co = null;

        co = ConectaBanco.getConexao();

        try {
            PreparedStatement p = co.prepareStatement(INSERT);

            p.setString(1, c.getNome());
            p.setString(2, c.getCpf());
            p.setString(3, c.getTel());
            p.setString(4, c.getEnde());
            p.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                co.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public ArrayList<Cliente> listar() {

        ArrayList<Cliente> lc = new ArrayList<>();

        Connection co = null;
        co = ConectaBanco.getConexao();

        try {
            PreparedStatement p = co.prepareStatement(SELECT_ALL);
            ResultSet rs = p.executeQuery();

            while (rs.next()) {
                Cliente cn = new Cliente(
                        rs.getInt(ID),
                        rs.getString(NOME),
                        rs.getString(CPF),
                        rs.getString(TEL),
                        rs.getString(ENDE));

                lc.add(cn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lc;
    }

}
