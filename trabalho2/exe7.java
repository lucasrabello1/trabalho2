import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        
        for (int i = 0; i < 5; i++) {
            vetor1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }
        
        boolean iguais = true;
        
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }
        
        if (iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores não são iguais.");
        }
        
        scanner.close();
    }
}
