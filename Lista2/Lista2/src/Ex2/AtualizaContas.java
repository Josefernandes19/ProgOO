package Ex2;


public class AtualizaContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizaContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("Conta: "+c.getNumero());
        System.out.println("Saldo anterior:"+c.getSaldo());
        // aqui você imprime o saldo anterior, atualiza a conta, 
        c.atualiza(this.selic);
        // e depois imprime o saldo final
        System.out.println("Saldo atual:" +c.getSaldo());
        // lembrando de somar o saldo final ao atributo saldoTotal
        System.out.println("====================================");
        this.saldoTotal += c.getSaldo();
    }
    
    public double getSaldoTotal(){
        return this.saldoTotal;
    }
    // outros métodos, colocar o getter para saldoTotal!
}
