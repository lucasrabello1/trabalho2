import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];
        
        for (int i = 0; i < 5; i++) {
            vetorA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            vetorB[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + 5] = vetorB[i];
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
        
        scanner.close();
    }
}
