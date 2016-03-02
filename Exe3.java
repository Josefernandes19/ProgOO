import java.util.Random;
import java.util.Scanner;

public class Exe3 {
    public static void main (String [] args){ 
        Scanner scan = new Scanner(System.in);
        Random numero = new Random();
        //num recebe um numero random, resp recebe um valor fora do Random.
        //A função random pega um número entre 0 e 200.
        int num = numero.nextInt(200), resp = 201, tentativas = 0;
        
        //Adivinhando..
        System.out.println("O número a ser descoberto é entre 0 e 200.");
        while (resp != num){
            System.out.print("Digite um número: ");
            resp = scan.nextInt();
            tentativas++;
            if (resp > num){
                System.out.println("O número que você inseriu é maior que a resposta...");
            } else if (resp < num){
                System.out.println("O número que você inseriu é menor que a resposta...");
            } else {
                System.out.println("Você adivinhou o número. O número de tentativas foram " + tentativas);
            }
        }
    }
}
