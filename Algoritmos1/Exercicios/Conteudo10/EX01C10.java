/*
* Autor: Hugo Oliveira Soares
*/
import java.util.Scanner;
public class EX01C10 {

    public static void main(String[] args) {
        
        double multa, valor, media, contador = 0, somatorio = 0;

        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            System.out.print("Digite um valor para calcular a multa: ");
            valor = teclado.nextDouble();

            if (valor != -1)
            {
                multa = 0.1 * valor;  // Multa = 10% do Valor
                System.out.println("Multa = "+ multa);
                somatorio += multa; // somatorio das multas
                contador++; // contador para a media das multas
            }
            System.out.println("Digite -1 no local de valor se deseja sair");

        } while (valor != -1);

        media = somatorio / contador;
        System.out.printf("A média das multas é: %.2f\n", media);
        
        teclado.close();

    }
}