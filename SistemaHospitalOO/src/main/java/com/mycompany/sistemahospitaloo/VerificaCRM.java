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
public class VerificaCRM {
    String CRM;

    public VerificaCRM(String CRM) {
        this.CRM = CRM;
    }
    public static boolean verificaCRM(String CRM){
        
        if(!CRM.contains("/")){
            return false;
        }
         String CRMseparado[] = CRM.split("/");
        
        for(int i = 0; i < CRMseparado[0].length(); i++){
            if(Character.isLetter(CRMseparado[0].charAt(i))){
                return false;
            }
        }
       
        if(!CRMseparado[1].matches("[A-Za-z]{2}")){
            return false;
        }
        
        return true;
    }
}
