package modelo;

public class ContaCorrente extends Conta{

    private float manutencao;

    public ContaCorrente(String titular, int numero, float saldo,
                         float manutencao) {
        super(titular, numero, saldo);
        this.manutencao = manutencao;
    }

    public float getManutencao() {
        return manutencao;
    }

    public void setManutencao(float manutencao) {
        this.manutencao = manutencao;
    }

    @Override
    public void fecharMes(){
        setSaldo(getSaldo()-manutencao);
    }

}
