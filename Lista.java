//Exercicio 1

//Circulo.java
package Exe1;


public class Circulo {
    private int raio;
    
    public Circulo(int raio){
        this.raio = raio;
    }
    
    public double calcularArea(int raio){
        return Math.PI * raio * raio;
    }
    
    public double calcularPerimetro(int raio){
        return 2*Math.PI*raio;
    }
}

//TesteCirculo.java

package Exe1;

import java.util.Scanner;

public class TesteCirculo {
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        int raio = scan.nextInt();
    
        Circulo circle = new Circulo(raio);
        System.out.println("Área do Circulo: "+circle.calcularArea(raio));
        System.out.println("Perímetro do Circulo: " + circle.calcularPerimetro(raio));
    }
}
