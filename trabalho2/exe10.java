import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        try {
            System.out.println("Digite os elementos do vetor A:");
            readIntArrayInput(scanner, vetorA);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
            scanner.close();
            return;
        }
        
        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }
        
        System.out.println("Vetor B (invertido):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorB[i] + " ");
        }
        
        scanner.close();
    }
    
    private static void readIntArrayInput(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
}
