/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class Funcionario extends Usuario{
    
    public Funcionario(String user, String senha) {
        super(user, senha);
        
    }

    // Métodos comuns a todos os funcionários
    public void realizarTarefa() {
        System.out.println("Tarefa a ser pensada.");
    }
}
