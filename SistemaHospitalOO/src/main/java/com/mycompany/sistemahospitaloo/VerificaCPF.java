/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class VerificaCPF {
    String CPF;

    public VerificaCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public static boolean verificaCPF(String CPF){
        //substitui os pontos e barra por vazio
        String CPFnumeros = CPF.replaceAll("[.-]", "");
        
        //verifica se tem 11 digitos
        if (CPFnumeros.matches("\\d{11}")) {
            //System.out.println("CPF formatado corretamente: " + CPFnumeros);
        } else {
            //System.out.println("CPF inválido.");
            return false;
        }
        
        //parser pra inteiro
        int[] digitos = new int[11];
            for (int i = 0; i < CPFnumeros.length(); i++) {
                digitos[i] = Character.getNumericValue(CPFnumeros.charAt(i));
            }

        
        //se todos os digitos sao iguais
        int primeiro = digitos[0];
        int iguais=1;
         for (int i = 1; i < digitos.length; i++) {
                if (digitos[i] != primeiro){
                    iguais = 0;
                    break;  
                }
        }
        if (iguais == 1){
            return false; //todos os digitos sao iguais
        }
        int primeiroDigitoVerificador = calcularDigitoVerificador(digitos, 10);
        int segundoDigitoVerificador = calcularDigitoVerificador(digitos, 11);

        // Comparar os dígitos verificadores calculados com os fornecidos
        return digitos[9] == primeiroDigitoVerificador && digitos[10] == segundoDigitoVerificador;
    
    }
    
     private static int calcularDigitoVerificador(int[] digitos, int pesoMaximo) {
        int soma = 0;
        int peso = pesoMaximo;

        for (int i = 0; i < pesoMaximo - 1; i++) {
            soma += digitos[i] * peso;
            peso--;
        }

        int resto = soma % 11;
        return resto < 2 ? 0 : 11 - resto;
    }
    
}
