/*
* Autor: Hugo Oliveira Soares
*/
import java.util.Scanner;

public class EX03C10 {

    public static void main(String[] args) {
        
        double angulo, raio, setor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do angulo: ");
        angulo = teclado.nextDouble();

        do
        {
            System.out.println("Digite o valor do raio: ");
            raio = teclado.nextDouble();
            if (raio != -1)
            {
                setor = (angulo * 3.1416 * Math.pow(raio, 2)) / 360;
                System.out.println("S = "+setor);
            }
            
        } while (raio != -1);


        teclado.close();

    }
}