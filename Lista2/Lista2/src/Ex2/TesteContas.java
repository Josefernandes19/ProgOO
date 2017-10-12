package Ex2;

public class TesteContas {
    private static final double SELIC = 0.01;
    public static void main(String[] args) {
        Conta c4 = new CCorrente(30.0);
        c4.depositar(1000.0);
        AtualizaContas adc = new AtualizaContas(SELIC);
        adc.roda(c4);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());

    }
}
