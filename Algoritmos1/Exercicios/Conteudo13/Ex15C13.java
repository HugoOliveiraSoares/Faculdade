import java.util.Scanner;

public class Ex15C13 {
    public static void main(String[] args) {
        
        int num[] = new int[10];
        int somatorio = 0, cont_pares = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < num.length; aux++)
        {
            System.out.print("Digite um número inteiro: ");
            num[aux] = teclado.nextInt();
        }

        System.out.print("Números pares: ");
        for (int aux = 0; aux < num.length; aux++)
        {
            if (num[aux] % 2 == 0) {
                System.out.print(num[aux]+" ");
                somatorio += num[aux];
                cont_pares++;
            }
        }

        System.out.println("\nMédia dos números pares = "+ (somatorio/cont_pares));

        teclado.close();

    }
}