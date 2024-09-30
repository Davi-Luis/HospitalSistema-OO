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
public class VerificaCartaoSUS {
    String SUS;

    public VerificaCartaoSUS(String SUS) {
        this.SUS = SUS;
    }
    public static boolean verificaSUS(String SUS){
        String SUSnumeros = SUS.replaceAll("[.-]", "");
        
        return SUSnumeros.matches("\\d{15}");
        
    }
}
