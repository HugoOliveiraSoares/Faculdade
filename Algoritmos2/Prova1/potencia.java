import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma base: ");
        int base = teclado.nextInt();
        System.out.print("Digite uma potencia: ");
        int potencia = teclado.nextInt();

        System.out.println(potencia(base, potencia));

        teclado.close();
    }

    public static int potencia(int n, int p) {
        int resultado = 1;
        for (int i = 1; i <= p; i++) {
            resultado *= n;
        }
        return resultado;
    }
}