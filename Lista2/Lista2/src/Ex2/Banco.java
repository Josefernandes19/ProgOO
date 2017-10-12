package Ex2;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> listaContas = new ArrayList();
    
    public void adiciona(Conta c){
        this.listaContas.add(c);
    }
    
    public Conta pegaConta(int x){
        return this.listaContas.get(x);
    }
    
    public int pegaTotalContas(){
        return this.listaContas.size();
    }
}
