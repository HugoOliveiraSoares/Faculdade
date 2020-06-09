import java.util.Scanner;

/**
 * Ex01C11
 */
public class Ex01C11 {

    public static void main(String[] args) {
        
        double fx, x, x_max, soma_fx = 0, media, cont_operacoes = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        x_max = teclado.nextDouble();

        x = 1;
        while (x <= x_max)
        {
            if (x % 2 != 0)
            {
                fx = Math.pow(x, 2) + (4*x - 2) / 5.0;
                System.out.println("x = "+x+ " f(x) = "+fx);
                soma_fx += fx;
                cont_operacoes++;
            }
            x++;
            
        }

        media = soma_fx / cont_operacoes;
        System.out.println("Media de f(x) = "+media);
        
        teclado.close();

    }
}