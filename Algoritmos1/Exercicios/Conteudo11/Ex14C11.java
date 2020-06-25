import java.util.Scanner;

public class Ex14C11 {
    public static void main(String[] args) {
        
        double serie = 0, num, den;
        int termos, aux;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de termos: ");
        termos = teclado.nextInt();

        aux = 1;
        while (aux <= termos)
        {
            num = 1;
            den = (aux - 1) + aux;
            
            if (aux % 2 == 0)
                serie -= num / den;
            else
                serie += num / den;

            aux++;
        }

        serie = 4 * serie;

        System.out.println("Valor de PI = "+serie);
        
        teclado.close();

    }
}