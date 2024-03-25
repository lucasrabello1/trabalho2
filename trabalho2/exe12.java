public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12};
        
        int produtoParesPositivos = calcularProdutoParesPositivos(vetor);
        
        System.out.println("O produto dos elementos pares positivos é: " + produtoParesPositivos);
    }
    
    private static int calcularProdutoParesPositivos(int[] vetor) {
        int produto = 1;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
            }
        }
        
        return produto;
    }
}
