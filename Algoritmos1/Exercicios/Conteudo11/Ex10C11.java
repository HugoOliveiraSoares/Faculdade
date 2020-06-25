import java.util.Scanner;

public class Ex10C11 {
    public static void main(String[] args) {
        
        int num, aux, aux2;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro entre 1 e 9: ");
        num = teclado.nextInt();

        aux = 1;
        while (aux <= num)
        {
            aux2 = 1;
            while (aux2 <= aux)
            {
                System.out.print("EMGE ");
                aux2++;
            }
            aux++;
            System.out.println();
        }
        
        teclado.close();

    }
}