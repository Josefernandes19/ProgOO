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

//Exercício 2
//Moto.java

package Exe2;

public class Moto {
    private String marca, modelo, cor;
    private int marcha, menorMarcha, maiorMarcha;
    private boolean ligada;
    
    public Moto (String marca, String modelo, String cor, int marcha, int menorMarcha, int maiorMarcha){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        this.menorMarcha = menorMarcha;
        this.maiorMarcha = maiorMarcha;
        
    }
    public void marchaAcima(){
        if (ligada){
            if (marcha + 1 > maiorMarcha){
                System.out.println("A moto já está na maior marcha possível.");
            }
            else{
                marcha++;
            }
        }
        else{
            System.out.println("A moto está desligada!");
        }
    }
    
    public void marchaAbaixo(){
        if (ligada){
            if (marcha - 1 < menorMarcha){
                System.out.println("A moto já está na menor marcha possível.");
            }
            else{
                marcha--;
            }
        }
        else{
            System.out.println("A moto está desligada!");
        }
    }
        
    
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
}
