import modelo2.*;

void main() {

    Funcionario funcionario = new Assalariado("111.111.111-01",
            "João", LocalDate.now(),1, 2000);
    Funcionario funcionario1 = new Horista("222.222.222-02",
            "Maria", LocalDate.now(), 2,
            10, 48);

    System.out.println(funcionario.calcularPagamento());
    System.out.println(funcionario1.calcularPagamento());


}