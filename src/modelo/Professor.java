package modelo;

import java.time.LocalDate;

public class Professor extends Pessoa {

    private int matricula;
    private float salario;

    public Professor(String nome, String cpf, LocalDate nascimento,
                     int matricula, String endereco, float salario) {
        super(nome, cpf, nascimento, endereco);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
