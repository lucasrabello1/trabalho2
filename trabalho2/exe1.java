import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;
        
        System.out.println("A média dos números é: " + media);
        System.out.println("Números menores que a média:");
        for (double numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }
    
        System.out.println("Números iguais à média:");
        for (double numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }

        System.out.println("Números superiores à média:");
        for (double numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }
        scanner.close();
    }
}
