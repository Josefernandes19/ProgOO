package Ex2;

public abstract class Conta {
    protected double saldo;
    private int numero;

    public Conta(Double valorInicial){
        this.saldo = valorInicial;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    
  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) throws ExceçãoChequeEspecial {
    if(valor <= this.saldo)
        this.saldo -= valor;
    else
        throw new ExceçãoChequeEspecial("Saldo insuficiente !", valor-this.saldo);

  }
  
  public abstract void atualiza(double taxa);
}
