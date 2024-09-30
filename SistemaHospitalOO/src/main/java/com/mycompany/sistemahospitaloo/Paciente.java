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
public class Paciente extends Usuario {
    private String numeroCartaoSUS;

    public Paciente(String user, String senha, String cpf, String numeroCartaoSUS) {
        super(user, senha, cpf); 
        this.numeroCartaoSUS = numeroCartaoSUS;
    }

    

    public String getNumeroCartaoSUS() {
        return numeroCartaoSUS;
    }

    public void setNumeroCartaoSUS(String numeroCartaoSUS) {
        this.numeroCartaoSUS = numeroCartaoSUS;
    }

    
    
}
