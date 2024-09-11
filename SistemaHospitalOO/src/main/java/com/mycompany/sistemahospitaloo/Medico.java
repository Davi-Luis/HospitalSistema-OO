package com.mycompany.sistemahospitaloo;

/**
 *
 * @author davil
 */
public class Medico extends Funcionario {
    private String especialidade;
    private String numeroCRM;
    private int id;

    public Medico(String especialidade, String numeroCRM, String user, String senha, int id) {
        super(user, senha);
        this.especialidade = especialidade;
        this.numeroCRM = numeroCRM;
        this.id = id;
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
