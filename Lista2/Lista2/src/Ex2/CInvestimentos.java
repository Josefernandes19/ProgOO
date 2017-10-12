package Ex2;

public class CInvestimentos extends Conta{

    private static final double PI = 3.14;

    public CInvestimentos(Double saldo) {
        super(saldo);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * PI;
    }

}
