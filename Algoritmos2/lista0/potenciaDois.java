import java.util.Scanner;

public class potenciaDois {
    public static void main(String[] args) {
        double numero;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        numero = teclado.nextDouble();

        int expoente = (int) log(numero);

        if (Math.pow(2, expoente) == numero) {
            System.out.println("2^"+expoente);
        }else{
            System.out.println(numero+" não é potencia de 2.");
        }
        
        teclado.close();
    }

    public static double log(double valor) {
        return Math.log10(valor) / Math.log10(2);
    }
}