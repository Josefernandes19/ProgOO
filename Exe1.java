import java.util.Scanner;   

public class Exe1 {
    public static void main (String [] args){ 
        Scanner scan = new Scanner(System.in);
        //Variáveis
        float a, b, c, result;
        //Leitura (não PrintLN pois apenas o print permite tudo em uma linha; o usuário vai poder por o input logo depois dos dois pontos)
        System.out.print("Digite o valor da primeira nota: ");
        a = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        b = scan.nextFloat();
        System.out.print("Digite o valor da terceira nota: ");
        c = scan.nextFloat();
        //Cálc
        result = (a+b+c)/3;
        //printando
        System.out.println("A sua média é: " +result);
      
    }
}
