import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        double[] numeros = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] > 0) {
                System.out.println("Número na posição " + i + " é positivo.");
            } else if (numeros[i] < 0) {
                System.out.println("Número na posição " + i + " é negativo.");
            } else {
                System.out.println("Número na posição " + i + " é zero.");
            }
        }
        scanner.close();
    }
}
