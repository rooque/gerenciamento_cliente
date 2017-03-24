/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 11151105952
 */
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String tel;
    private String ende;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String tel, String ende) {

        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.ende = ende;
    }

    public Cliente(int id, String nome, String cpf, String tel, String ende) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.ende = ende;
    }

}
