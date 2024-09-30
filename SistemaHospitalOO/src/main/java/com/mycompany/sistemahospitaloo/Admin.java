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
public class Admin extends Funcionario{

    public Admin( String user, String senha) {
        super(user, senha);
    }
    
    @Override
    public  String mensagemSaida() {
        return "Logout do administrador realizado com sucesso";
    }
}
