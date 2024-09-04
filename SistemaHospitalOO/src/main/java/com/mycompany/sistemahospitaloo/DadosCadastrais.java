/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class DadosCadastrais {
    public static void main(String[] args) {
        String filePath = "src/main/resources/dados.txt";
        
        // Criar o arquivo se ele não existir
        Arquivo.criaArquivo(filePath);
        
        // Conteúdos para adicionar ao arquivo
        
        //String conteudo1 = "Este é o conteúdo 111111111111 do arquivo gerado no projeto.";
        //String conteudo2 = "Este é o conteúdo 222222222222222222222222222 do arquivo gerado no projeto.";
        //String conteudo3 = "Este é o conteúdo 33333333333333333333 do arquivo gerado no projeto.";
    
        // Adicionar o conteúdo ao arquivo
        //Arquivo.adiciona(filePath, conteudo1);
        //Arquivo.adiciona(filePath, conteudo2);
        //Arquivo.adiciona(filePath, conteudo3);
        System.out.println("Conteúdos adicionados ao arquivo com sucesso.");
        
        // Lendo o arquivo salvo
        
        Arquivo.apagaLinha(filePath, 4);
        String conteudoLido = Arquivo.le(filePath);
        System.out.println("Conteúdo lido do arquivo: \n" + conteudoLido);
    }
   
}
