import modelo.*;

void main() {

    Conta conta = new ContaCorrente("João", 1, 2000,
            30);
    Conta conta1 = new ContaPoupanca("Maria", 2, 2000,
            10);

    conta.fecharMes();
    conta1.fecharMes();

    System.out.println(conta.getSaldo());
    System.out.println(conta1.getSaldo());

}