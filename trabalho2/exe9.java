import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];
        
        try {
            System.out.println("Digite os elementos do vetor A:");
            readIntArrayInput(scanner, vetorA);
            
            System.out.println("Digite os elementos do vetor B:");
            readIntArrayInput(scanner, vetorB);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
            return;
        }
        
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }
        
        System.out.println("Vetor C resultante:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorC[i] + " ");
        }
        
        scanner.close();
    }
    
    private static void readIntArrayInput(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
}
