import java.util.Scanner;

public class Ex19C13 {
    public static void main(String[] args) {
        
        int bilhete[] = new int[10];
        int bilhete_sorteado = 0, posicao = -1;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < bilhete.length; aux++)
        {
            System.out.print("Digite um número de bilhete da loteria: ");
            bilhete[aux] = teclado.nextInt();
        }

        System.out.print("Digite o número do bilhete sorteado: ");
        bilhete_sorteado = teclado.nextInt();

        for (int aux = 0; aux < bilhete.length; aux++)
            if (bilhete_sorteado == bilhete[aux])
                posicao = aux;

        if (posicao != -1)
            System.out.println("Você foi premiado!");
        else
            System.out.println("Você não foi premiado!");

        teclado.close();

    }
}