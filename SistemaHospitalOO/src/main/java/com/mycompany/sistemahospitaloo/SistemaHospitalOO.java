/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemahospitaloo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author davil
 */
public class SistemaHospitalOO {
    
    public static int verificaTipoUsuario(Usuario usuario) {
        //verifica se são dados validos presentes no arquivo txt
        //
        //
        //
        //verfica o tipo de usuario e retorna 1 para paciente, 2 para medico, e 3 para admin
        
        return 1;
        
    }

    public static void main(String[] args) throws IOException{
        
        System.out.println("""
                           Bem-vindo(a) ao Hospital Universit\u00e1rio!
                           Digite seu nome de usu\u00e1rio e senha."""); //se nao tiver cadastro, clique em realizar cadastro
        Scanner leitor = new Scanner(System.in);
        String username = leitor.nextLine();
        String senha = leitor.nextLine();
        Usuario usuario = new Usuario(username, senha);
        int tipo = verificaTipoUsuario(usuario);
        switch (tipo) {
            case 1:
                System.out.println("Paciente identificado.");
                //busca no arquivo o numero SUS deste paciente
                //Paciente paciente = new Paciente(sus);
                break;
            case 2:
                System.out.println("Médico identificado.");

                break;
            case 3:
                System.out.println("Admin identificado.");
                
                break;
            default:
                throw new AssertionError();
        }
        
        JFrame teste = new ViewLogin();
        teste.setVisible(true);
        
        
     
    }
    
}
