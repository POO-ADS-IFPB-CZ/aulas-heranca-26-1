import modelo.Funcionario;
import modelo.Professor;
import modelo.Tecnico;

void main() {

    Funcionario funcionarios[] = {
            new Tecnico("João", "111.111.111-01",
                    LocalDate.of(2000,3,5),
                    "Rua a, 30", 123, 2000,
                    "Laboratório"),
            new Tecnico("Maria", "222.222.222-02",
                    LocalDate.of(2000,3,5),
                    "Rua a, 30", 123, 2000,
                    "Laboratório"),
            new Professor("Pedro", "333.333.333-03",
                    LocalDate.of(2000,3,2),
                    "Rua X, 40", 123, 2000,
                    "Doutorado"),
            null
    };

    int totalProfessores = 0;
    int totalTecnicos = 0;

    for(Funcionario f : funcionarios){
        if(f instanceof Tecnico) totalTecnicos++;
        if(f instanceof Professor) totalProfessores++;
    }

    System.out.println(totalProfessores);
    System.out.println(totalTecnicos);


}