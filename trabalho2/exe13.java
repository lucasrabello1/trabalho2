import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int[] fibonacci = calcularFibonacci(n);
        
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são: " + Arrays.toString(fibonacci));
    }
    
    private static int[] calcularFibonacci(int n) {
        int[] fibonacci = new int[n];
        
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
}
