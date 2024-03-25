import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 números:");
        vetor[0] = scanner.nextInt();
        
        for (int i = 1; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("O número digitado não é maior que o anterior. Digite novamente:");
                i--; // Para ler novamente o número atual
            }
        }
        
        System.out.println("Vetor preenchido de acordo com a regra: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}
