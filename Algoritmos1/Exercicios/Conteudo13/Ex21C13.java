import java.util.Scanner;

public class Ex21C13 {
    public static void main(String[] args) {
        
        int num[] = new int[20];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < num.length; aux++)
        {
            System.out.print("Digite um número inteiro: ");
            num[aux] = teclado.nextInt();

        }

        for (int aux = 0; aux < 19; aux+=2)
        {
            System.out.print(num[aux]+" ");
        }

        for (int aux = 1; aux <= 19; aux+=2)
        {
            System.out.print(num[aux]+" ");
        }

        System.out.println();

        teclado.close();

    }
}