/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class Usuario {
    private String user;
    private String senha;

    public Usuario(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }
    
    public Usuario() { //construtor padrao
       
    }
    
    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

    
}
