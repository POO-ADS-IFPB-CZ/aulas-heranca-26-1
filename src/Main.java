import modelo.Aluno;
import modelo.Pessoa;
import modelo.Professor;

void main() {

   Pessoa pessoa = new Aluno("Maria", "222.222.222-02",
           LocalDate.of(2000, 4,7),
           123, "Rua B, 333, Cajazeiras",
           "ADS");
    Pessoa pessoa1 = new Professor("José",
            "333.333.333-03",
            LocalDate.of(2000,8,3),
            321, "Rua C, 123, Cajazeiras",
            2000);

}