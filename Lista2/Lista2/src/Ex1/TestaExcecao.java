package Ex1;

public class TestaExcecao {
  public static void main (String [] args) { 
    try{
        for (int i=0; i < 4; i++){ 
            System.out.println("args[" + i + "]  = " + args[i]); 
        }
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Sua batata; Erro: " + e);
        System.out.println("A aplicação será finalizada.");
    }
  } 
} 
