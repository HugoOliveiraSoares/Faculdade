import java.util.Scanner;

public class Ex14C8 {
    public static void main(String[] args) {
        
        String simbolo;
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um simbolo: ");
        simbolo = teclado.nextLine();
        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        for (int aux = 1; aux <= numero; aux++)
        {
            for (int aux2 = 1; aux2 <= numero; aux2++)
            {
                System.out.print(simbolo + " ");
            }          
            System.out.println("\n");
        }
                
        teclado.close();

    }

}