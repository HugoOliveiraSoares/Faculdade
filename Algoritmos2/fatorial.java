public class fatorial {
    public static void main(String[] args) {
        System.out.println("Iterativo: "+ fatorial_iterativo(5) );
        System.out.println("Recursivo: " + fatorial_iterativo(5) );
    }
    
    public static int fatorial_iterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorial_recursivo(int n) {

        if (n <= 1) {
            return( 1 );
        }else{
            return( n * fatorial_recursivo(n - 1) );
        }
    }
}