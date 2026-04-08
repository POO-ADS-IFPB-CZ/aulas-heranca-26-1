package modelo;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private String titulacao;

    public Professor(String nome, String cpf, LocalDate nascimento,
                     String endereco, int matricula, float salario,
                     String titulacao) {
        super(nome, cpf, nascimento, endereco, matricula, salario);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public float calcularPagamento() {
        float salarioFinal = salario;
        switch (titulacao){
            case "Especialização" -> salarioFinal+=500;
            case "Mestrado" -> salarioFinal+=1000;
            case "Doutorado" -> salarioFinal+=2000;
        }
        return salarioFinal;
    }
}
