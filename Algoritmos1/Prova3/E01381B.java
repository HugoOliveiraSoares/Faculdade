/* Autor: Hugo Oliveira Soares - E01381 */
import java.util.Scanner;

public class E01381B {
    public static void main(String[] args) {

        String palavra, palavra_contrario = "";
        int cont_palindromo = 0, cont_total = 0;
        double percentual;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        palavra = teclado.nextLine();

        do
        {
            for (int aux = palavra.length() - 1; aux >= 0; aux--)
            {
                palavra_contrario += palavra.split("")[aux]; // Retorna cada letra do novo array gerado pelo .split() com regra de separação sem espaços
            }

            if (palavra.compareToIgnoreCase(palavra_contrario) == 0)
            {
                System.out.println("É palindromo");
                cont_palindromo++;
            } else
            {
                System.out.println("Não é palindromo");
            }

            cont_total++;
            palavra_contrario = ""; // "limpa" a varial para a nova interação

            System.out.print("Digite uma palavra: ");
            palavra = teclado.nextLine();
            
        } while (!palavra.equalsIgnoreCase("FIM")); // Se for diferente(!) de fim permanece no loop

        percentual = (double) (cont_palindromo * 100) / cont_total;
        System.out.printf("Percentual = %.2f %%\n",percentual);

        teclado.close();

    }
}