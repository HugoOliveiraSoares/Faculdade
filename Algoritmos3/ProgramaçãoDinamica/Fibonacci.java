public class Fibonacci {
    
    
    static long[] fib;

    static long fiboProgDin(int n){
        fib = new long[n+1];
        int aux = 0;

        return fiboRecProgDin(aux, n);
    }

    static long fiboRecProgDin(int aux, int n){
        
        if (aux <= n) {
            
            if (aux < 2) {
                fib[aux] = 1;
            }else{
                fib[aux] = fib[aux - 1] + fib[aux - 2];
            }

            return fiboRecProgDin(aux + 1, n);

        } else {  
            return fib[fib.length - 1];
        }
        
    }

    static long fiboIterativo(int n){
        long[] fibo = new long[n + 1];

        if(n < 2){
            return 1;
        }else{
            fibo[0] = 1;
            fibo[1] = 1;
            for (int i = 2; i <= n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }

            return fibo[n];
        }
    }

    static long fiborecursivo(int n){
        if (n < 2) {
            return 1;
        } else {
            return fiborecursivo(n - 1) + fiborecursivo(n - 2);
        }
    }
 
    static long[] fiboCalculado;
    static int auxPos;
    public static long fiboProgDinamica(int n) {
        fiboCalculado = new long[n + 2];
        auxPos = 2;

        return fiboRecProgDinamica(n);
    }

    private static long fiboRecProgDinamica(int n){
        if (n < 0) {
            return fiboCalculado[0];
        } else {
            if (auxPos < 3) {
                fiboCalculado[n] = auxPos - 1;
                auxPos++;
            } else {
                fiboCalculado[n] = fiboCalculado[n + 1] + fiboCalculado[n + 2];
            }

            return fiboRecProgDinamica(n - 1);
        }
    }

    static long[] fiboCalculadoAlike;
    public static long fiboProgDinamicaAlike(int n) {
        fiboCalculadoAlike = new long[n+2];
        return fiboRecProgDinamicaAlike(n);
    }

    private static long fiboRecProgDinamicaAlike(int n){
        if (n < 0) { // n invalido: retorna valor inválido
            return 0;
        } else {
            if (n < 2) {
                fiboCalculadoAlike[n] = 1;
                return fiboCalculadoAlike[n];
            } else {
                if(fiboCalculadoAlike[n - 1] == 0)
                   fiboCalculadoAlike[n - 1] = fiboRecProgDinamicaAlike(n - 1);
                if(fiboCalculadoAlike[n - 2] == 0)
                   fiboCalculadoAlike[n - 2] = fiboRecProgDinamicaAlike(n - 2);

                fiboCalculadoAlike[n] = fiboCalculadoAlike[n - 1] + fiboCalculadoAlike[n - 2];
                
                return fiboCalculadoAlike[n];
            }
        }
    }

    public static void main(String[] args) {

        // for (int i = 0; i < 50; i++) {
        //     System.out.print(fiboProgDinamicaAlike(i) + ", " );
        // }
        // System.out.println();
        
        
        // System.out.println(fiboProgDinamicaAlike(3));
        System.out.println( fiboProgDin(50) );

    }
}