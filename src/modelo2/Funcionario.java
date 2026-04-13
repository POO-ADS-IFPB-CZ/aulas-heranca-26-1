package modelo2;

import java.time.LocalDate;

public abstract class Funcionario {
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private int matricula;

    public Funcionario(String cpf, String nome, LocalDate nascimento, int matricula) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public abstract float calcularPagamento();

}
