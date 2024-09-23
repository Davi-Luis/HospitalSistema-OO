/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

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
        
        //se nao tiver barrra
        if(!CRM.contains("/")){
            return false;
        }
        //separa pela barra 
         String CRMseparado[] = CRM.split("/");
        
        //se tiver letras antes da barra
        for(int i = 0; i < CRMseparado[0].length(); i++){
            if(Character.isLetter(CRMseparado[0].charAt(i))){
                return false;
            }
        }
       
        //se tiver mais que dois digitos depois da barra
        if(!CRMseparado[1].matches("[A-Za-z]{2}")){
            return false;
        }
        
        return true;
    }
}
