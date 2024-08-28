package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class Medico extends Funcionario {
    private String especialidade;
    private String numeroCRM;

    public Medico(String especialidade, String numeroCRM, String nome, String id, String user, String senha) {
        super(nome, id, user, senha);
        this.especialidade = especialidade;
        this.numeroCRM = numeroCRM;
    }

    

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNumeroCRM() {
        return numeroCRM;
    }

    public void setNumeroCRM(String numeroCRM) {
        this.numeroCRM = numeroCRM;
    }

    // Método específico para médicos
    public void realizarConsulta() {
        System.out.println("Médico realizando consulta.");
    }
}
