package Ex2;

public class ExceçãoChequeEspecial extends Exception {
    private Double deficit;

    public ExceçãoChequeEspecial(String menssagem, Double deficit){
        super(menssagem);
        this.deficit = deficit;
    }
    public Double getDeficit() {
        return deficit;
    }
    
    
}
