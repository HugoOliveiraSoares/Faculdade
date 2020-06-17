import java.util.Scanner;

public class Ex20C13 {
    public static void main(String[] args) {
        
        int num[] = new int[10];
        int somatorio = 0, quant_maiores = 0;
        double media;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < num.length; aux++)
        {
            System.out.print("Digite um número: ");
            num[aux] = teclado.nextInt();
        }

        System.out.print("Números maiores que "+num[num.length - 1]+": ");
        for (int aux = 0; aux < num.length; aux++)
        {
            if (num[num.length - 1] < num[aux])
            {
                System.out.print(num[aux]+" ");
                quant_maiores++;
                somatorio += num[aux];
            }
        }

        media = (double) somatorio / quant_maiores;
        System.out.println("\nMédia dos números impressos = "+ media);

        teclado.close();

    }
}