/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospitaloo;

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

}
