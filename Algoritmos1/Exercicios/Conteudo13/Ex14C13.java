import java.util.Scanner;

public class Ex14C13 {
    public static void main(String[] args) {
        
        String estado[] = new String[100];
        int populacao[] = new int[100];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < 10; aux++) {
            System.out.print("Digite o nome do estado: ");
            estado[aux] = teclado.nextLine();
            System.out.println("Digite a população desse estado: ");
            populacao[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        teclado.close();

    }
}