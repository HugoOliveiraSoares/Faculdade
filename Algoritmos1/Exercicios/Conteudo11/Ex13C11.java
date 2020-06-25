import java.util.Scanner;

public class Ex13C11 {
    public static void main(String[] args) {
        
        int termos, aux;
        double serie = 0, num, den;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de termos: ");
        termos = teclado.nextInt();

        aux = 1;
        while (aux <= 20)
        {
            num = aux * Math.pow(aux*9+1, (aux*2));
            den = Math.pow(7, aux-1);
            serie += num/den;
            aux++;
        }

        serie = 71+Math.cbrt(serie);
        System.out.println("Valor da serie: "+serie);
        
        teclado.close();

    }
}