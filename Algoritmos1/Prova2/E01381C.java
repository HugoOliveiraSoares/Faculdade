/*
*
* Autor: Hugo Oliveira Soares
*
*/
import java.util.Scanner;
public class E01381C {
    public static void main(String[] args) {
        
        double serie = 0, num, den;
        int ntermos;

        Scanner teclado = new Scanner(System.in);   
        
        System.out.print("Digite o número de termos da série: ");
        ntermos = teclado.nextInt();
        
        for (int aux = 1; aux <= ntermos; aux++)
        {
            num = Math.pow(7, aux - 1) + Math.sqrt(aux * 2 + 3);
            den = Math.pow(aux + 9, aux);
            
            serie += num / den;
        }

        serie = 100 + 2/3.0 * Math.pow(serie, 5);
        System.out.println(serie);
        
        teclado.close();

    }
}