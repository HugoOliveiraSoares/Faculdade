import java.util.Scanner;

public class CalcSomaMedia {
    public static void main(String[] args) {
        long n1, n2, n3, soma;
        float media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        n1 = teclado.nextLong();
        System.out.print("Informe outro numero: ");
        n2 = teclado.nextLong();
        System.out.print("Informe mais um numero: ");
        n3 = teclado.nextLong();

        soma = n1 + n2 + n3;
        media = soma / 3;
        System.out.println("Média = " + media);
        teclado.close();

    }
}