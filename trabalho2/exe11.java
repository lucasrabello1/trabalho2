public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {0, 2, 4, 6, 8};
        int[] vetor2 = {1, 3, 5, 7, 9};
        
        int produtoEscalar = calcularProdutoEscalar(vetor1, vetor2);
        
        System.out.println("O produto escalar entre os vetores é: " + produtoEscalar);
    }
    
    private static int calcularProdutoEscalar(int[] vetor1, int[] vetor2) {
        int produtoEscalar = 0;
        
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }
        
        return produtoEscalar;
    }
}
