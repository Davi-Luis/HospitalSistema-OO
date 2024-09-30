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
public class VerificaCPF {
    String CPF;

    public VerificaCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public static boolean verificaCPF(String CPF){
        String CPFnumeros = CPF.replaceAll("[.-]", "");
        
        if (CPFnumeros.matches("\\d{11}")) {
            //System.out.println("CPF formatado corretamente: " + CPFnumeros);
        } else {
            //System.out.println("CPF inválido.");
            return false;
        }
        
        int[] digitos = new int[11];
            for (int i = 0; i < CPFnumeros.length(); i++) {
                digitos[i] = Character.getNumericValue(CPFnumeros.charAt(i));
            }

        
        int primeiro = digitos[0];
        int iguais=1;
         for (int i = 1; i < digitos.length; i++) {
                if (digitos[i] != primeiro){
                    iguais = 0;
                    break;  
                }
        }
        if (iguais == 1){
            return false; 
        }
        int primeiroDigitoVerificador = calcularDigitoVerificador(digitos, 10);
        int segundoDigitoVerificador = calcularDigitoVerificador(digitos, 11);

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
