/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class Paciente extends Usuario {
    private String numeroCartaoSUS;

    public Paciente(String user, String senha, String cpf, String numeroCartaoSUS) {
        super(user, senha, cpf); //precisa disso ja que nao tem nada?
        this.numeroCartaoSUS = numeroCartaoSUS;
    }

    

    public String getNumeroCartaoSUS() {
        return numeroCartaoSUS;
    }

    public void setNumeroCartaoSUS(String numeroCartaoSUS) {
        this.numeroCartaoSUS = numeroCartaoSUS;
    }

    // Método específico para pacientes
    public void marcarConsulta() {
        System.out.println("Paciente marcando consulta.");
    }
    
}
