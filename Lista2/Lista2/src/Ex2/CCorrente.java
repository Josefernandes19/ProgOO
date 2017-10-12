package Ex2;

public class CCorrente extends Conta {

    private Double chequeEspecial;
    
    public CCorrente(Double saldo){
        super(saldo);
    }

    public CCorrente(Double saldo, Double protecao){
        super(saldo);
    }
    
    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa *2;
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.10);
    }
    
    @Override
    public void sacar(double valor) throws ExceçãoChequeEspecial{
        if (valor > super.getSaldo() && this.chequeEspecial == 0){
            throw new ExceçãoChequeEspecial("Não há cheque especial !", valor-super.getSaldo());
        }
        else if (valor > super.getSaldo() + this.chequeEspecial){
            throw new ExceçãoChequeEspecial("Saldo insuficiente no cheque especial !", valor-(super.getSaldo() + this.chequeEspecial));
        }
        else{
            super.sacar(valor);
        }
    }
}
