import java.util.Scanner;

public class Exercicio5 {
    // Função: Verifica se um numero é divisivel por 5 e 7
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        if (numero % 5 == 0 && numero % 7 == 0) 
        {
            System.out.println(numero + " é divisível simultaneamente por 5 e 7");

        }else
        {
            System.out.println(numero + " não é divisível simultaneamente por 5 e 7");
        }
        
        teclado.close();

    }

}