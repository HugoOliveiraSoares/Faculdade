public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci_iterativo(5));
        System.out.println(fibonacci_recursivo(5));
    }

    public static int fibonacci_iterativo(int n) {
        int numeroAtual = 1;
        int numeroAnterior = 0;
        for (int i = 1; i <= n; i++) { // 6
            numeroAtual = numeroAtual + numeroAnterior; // 8
            numeroAnterior = numeroAtual - numeroAnterior; // 5
        }
        return numeroAtual;
    }

    public static int fibonacci_recursivo(int n) {
        
        if (n < 2) {
            return( n );
        }else{
            return( fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2) );
        }
    }

}
