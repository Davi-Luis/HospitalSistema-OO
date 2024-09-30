/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;
//Taynara Carlos FErraz - 202365571C
//Davi Luís de Faria Rocha - 202365519B
/**
 *
 * @author davil
 */
public class Usuario {
    private String user;
    private String senha;
    private String cpf;

    public Usuario(String user, String senha, String cpf) {
        this.user = user;
        this.senha = senha;
        this.cpf = cpf;
    }
    
    public Usuario(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }
    public Usuario() { 
       
    }
    
    public String getUser() {
        return user;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getSenha() {
        return senha;
    }

    
}
