package modelo;

public class ContaPoupanca extends Conta{

    private float juros;

    public ContaPoupanca(String titular, int numero, float saldo, float juros) {
        super(titular, numero, saldo);
        this.juros = juros;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    @Override
    public void fecharMes(){
        setSaldo(getSaldo()+(getSaldo()*(juros))/100);
    }

}
