import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[5];
        double[] pesos = new double[5];
        
        for (int i = 0; i < 5; i++) {
            notas[i] = readDoubleInput(scanner, "Digite a nota " + (i + 1) + ": ");
        }
        
        for (int i = 0; i < 5; i++) {
            pesos[i] = readDoubleInput(scanner, "Digite o peso " + (i + 1) + ": ");
        }
        
        double somaNotaPeso = 0;
        double somaPesos = 0;
        
        for (int i = 0; i < 5; i++) {
            somaNotaPeso += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        
        if (somaPesos == 0) {
            System.out.println("Erro: A soma dos pesos não pode ser zero.");
            return;
        }
        
        double mediaPonderada = somaNotaPeso / somaPesos;
        
        System.out.println(mediaPonderada);
        
        scanner.close();
    }
    
    private static double readDoubleInput(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                double input = scanner.nextDouble();
                if (input < 0) {
                    System.out.println("Erro: Por favor, insira um valor positivo.");
                } else {
                    return input;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um valor numérico válido.");
                scanner.next();
            }
        }
    }
}
