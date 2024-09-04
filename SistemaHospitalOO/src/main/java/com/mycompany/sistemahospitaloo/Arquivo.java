/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
import java.io.*;
  
public class Arquivo {

    // Método para criar um novo arquivo, se ele não existir
    public static void criaArquivo(String filePath) {
        File arquivo = new File(filePath);
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    // Método para ler o conteúdo de um arquivo
    public static String le(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return content.toString();
    }

    // Método para adicionar conteúdo ao final do arquivo
    public static void adiciona(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine(); // Adiciona uma nova linha após o conteúdo
        } catch (IOException e) {
            System.out.println("Erro ao adicionar ao arquivo: " + e.getMessage());
        }
    }

    // Método para apagar uma linha específica no arquivo
    public static void apagaLinha(String filePath, int linhaParaApagar) {
        StringBuilder novoConteudo = new StringBuilder();
        int linhaAtual = 1;  // Começar de 1 ao invés de 0

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (linhaAtual != linhaParaApagar) {  // Se não for a linha que queremos apagar, mantemos
                    novoConteudo.append(line).append("\n");
                }
                linhaAtual++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Sobrescreve o arquivo com o novo conteúdo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(novoConteudo.toString());
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
