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
public class DadosCadastrais {
    public static void main(String[] args) {
        String filePath = "src/main/resources/dados.txt";
        
        Arquivo.criaArquivo(filePath);
       
        System.out.println("Conteúdos adicionados ao arquivo com sucesso.");
        
        
        Arquivo.apagaLinha(filePath, 4);
        String conteudoLido = Arquivo.le(filePath);
        System.out.println("Conteúdo lido do arquivo: \n" + conteudoLido);
    }
   
}
