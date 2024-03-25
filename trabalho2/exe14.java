import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        int indiceMaiorElemento = encontrarIndiceMaiorElemento(vetor);
        int maiorElemento = vetor[indiceMaiorElemento];
        
        for (int i = indiceMaiorElemento; i < 4; i++) {
            vetor[i] = vetor[i + 1];
        }
        
        vetor[4] = maiorElemento;
        
        System.out.println("Vetor atualizado: " + Arrays.toString(vetor));
        
        scanner.close();
    }
    
    private static int encontrarIndiceMaiorElemento(int[] vetor) {
        int indiceMaiorElemento = 0;
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaiorElemento]) {
                indiceMaiorElemento = i;
            }
        }

        return indiceMaiorElemento;
    }
}
