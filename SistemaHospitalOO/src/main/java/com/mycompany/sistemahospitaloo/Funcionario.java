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
    private String nome;
    private String id;

    public Funcionario(String nome, String id, String user, String senha) {
        super(user, senha);
        this.nome = nome;
        this.id = id;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Métodos comuns a todos os funcionários
    public void realizarTarefa() {
        System.out.println("Tarefa a ser pensada.");
    }
}
