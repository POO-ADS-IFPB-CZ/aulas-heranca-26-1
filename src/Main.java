import modelo.Funcionario;
import modelo.Professor;
import modelo.Tecnico;

void main() {

    Funcionario funcionario = new Professor("João",
            "111.111.111-01",
            LocalDate.of(2000,2,3),
            "Rua Z, 300, Cajazeiras",
            123, 2000, "Doutorado");
    Tecnico funcionario1 = new Tecnico("Maria",
            "222.222.222-02",
            LocalDate.of(2000,3,3),
            "Rua Y, 100, Cajazeiras",
            312, 2000, "Laboratório de química");
    System.out.println(funcionario.calcularPagamento());
    System.out.println(funcionario1.calcularPagamento());

}