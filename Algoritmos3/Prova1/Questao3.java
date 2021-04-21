public class Questao3 {
    
    static double xIterativo(int n){

        double x[] = new double[n+1];

        for (int i = 0; i <= n; i++) {
            
            if (i == 0 || i == 1) {
                x[i] = Math.sqrt(2);
            }else{
                x[i] = Math.sqrt(2 + x[i - 1] + x[i - 2]);
            }
        }

        return x[x.length - 1];
    }

    static double xRecursivo(int n){

        if (n == 0 || n == 1) {
            return Math.sqrt(2);
        } else {
            return Math.sqrt(2 + xRecursivo(n - 1) + xRecursivo(n - 2));
        }

    }

    static double[] x;
    static int aux;

    static double xProgDin(int n){
        
        x = new double[n+1];
        aux = 0;

        return xProgRecDin(n);

    }

    private static double xProgRecDin(int n) {

        if (n < 0) {
            return x[0];
        } else {

            if (aux == 0 || aux == 1) {
                x[n] = Math.sqrt(2);
                aux++;
            } else {
                x[n] = Math.sqrt(2 + x[n + 1] + x[n + 2]);
            }

            return xProgRecDin(n - 1);
        }
       
    }

    public static void main(String[] args) {

        System.out.println("Iterativo: " + xIterativo(5));
        System.out.println("Recursivo: " + xRecursivo(5));
        System.out.println("Prog. Dinamica: " + xProgDin(5));

    }

}
