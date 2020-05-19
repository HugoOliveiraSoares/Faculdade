/*
*
* Função: Calcula o raio de 10 circulos
* Autor: Hugo Oliveira Soares
*
*/
import java.util.Scanner;

public class Ex01C8 
{
    public static void main(String[] args) 
    {
        double raio, area =0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) 
        {
            System.out.print("Digite o valor do raio: ");
            raio = teclado.nextDouble();

            area = 3.1416*Math.pow(raio, 2);
            System.out.println("área =  " + area);
        }

        teclado.close();
    }
}