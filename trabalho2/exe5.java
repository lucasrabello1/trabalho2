import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        int n = scanner.nextInt();
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                count++;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}
