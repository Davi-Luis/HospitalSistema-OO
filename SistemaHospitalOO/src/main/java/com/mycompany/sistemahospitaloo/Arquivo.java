/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Arquivo {

    private int count = 0;

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
    public static void adiciona(String filePath, Object content) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Object> existingContent = new ArrayList<>();

        // Tentar ler o conteúdo existente no arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Type listType = new TypeToken<List<Object>>(){}.getType();
            existingContent = gson.fromJson(reader, listType);
            if (existingContent == null) {
                existingContent = new ArrayList<>();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Criando um novo arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Adicionar o novo conteúdo ao array existente
        existingContent.add(content);

        // Reescrever o arquivo com o conteúdo atualizado
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String json = gson.toJson(existingContent);
            writer.write(json);
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
