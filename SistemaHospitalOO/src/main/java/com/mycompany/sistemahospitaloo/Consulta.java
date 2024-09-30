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
public class Consulta {
    private String paciente;
    private String medico;
    private String idMedico;
    private String data;
    private String hora;
    private String plano;


    public Consulta(String paciente, String medico, String idMedico, String data, String hora, String plano) {
        this.paciente = paciente;
        this.medico = medico;
        this.idMedico = idMedico;
        this.data = data;
        this.hora = hora;
        this.plano = plano;
       
    }

    public String getMedico() {
        return medico;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
    
    

}
