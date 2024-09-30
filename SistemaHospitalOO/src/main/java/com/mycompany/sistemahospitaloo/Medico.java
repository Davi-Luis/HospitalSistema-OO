package com.mycompany.sistemahospitaloo;
//Taynara Carlos FErraz - 202365571C
//Davi Luís de Faria Rocha - 202365519B
/**
 *
 * @author davil
 */
public class Medico extends Funcionario {
    private String especialidade;
    private String numeroCRM;
    private String id;

    public Medico(String especialidade, String numeroCRM, String user, String senha, String id) {
        super(user, senha);
        this.especialidade = especialidade;
        this.numeroCRM = numeroCRM;
        this.id = id;
    }

    public String getId() {
        return id;
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

    
    @Override
    public  String mensagemSaida() {
        return "Logout do medico realizado com sucesso";
    }
}
