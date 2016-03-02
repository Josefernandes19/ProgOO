import java.util.Scanner;   

public class exe2 {
    public static void main (String [] args){ 
        Scanner scan = new Scanner(System.in);
        //Algumas variáveis
        int tam, a, b, lixo;
        //Recebendo tamanho do vetor;
        System.out.print("Digite o tamanho do vetor: ");
        tam = scan.nextInt();
        //Declarando vetor (não entendi o new int [tam]
        int vet[] = new int [tam];
        System.out.println("Digite os valores do vetor: ");
        for (a=0; a<tam; a++){
            vet[a] = scan.nextInt();
        }
        //Ordenando vetor (apenas comparar com o próximo como sempre fizemos zz)
        for (a=0; a<tam; a++){
            for (b=0; b<tam-1; b++){
                if(vet[a]<vet[b]){
                    lixo = vet[a];
                    vet[a] = vet[b];
                    vet[b] = lixo;
                }
            }
        }
        //Escrevendo o vetor (em uma linha, pq não.)
        System.out.print("O vetor ordenado é:");
        for (a=0; a<tam; a++){
            System.out.print (" " + vet[a]);
        }
    }
}
