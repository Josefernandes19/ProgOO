package Ex2;

public class CPoupança extends Conta {

    public CPoupança(double saldo) {
        super(saldo);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
