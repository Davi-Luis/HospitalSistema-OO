/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class VerificaCartaoSUS {
    String SUS;

    public VerificaCartaoSUS(String SUS) {
        this.SUS = SUS;
    }
    public static boolean verificaSUS(String SUS){
        //substitui os pontos e barra por vazio
        String SUSnumeros = SUS.replaceAll("[.-]", "");
        
        //retorna true se tem 15 digitos
        return SUSnumeros.matches("\\d{15}");
        
    }
}
