import java.util.Scanner;

public class Ex3C9 {

    public static void main(String[] args) {

        double serie = 0, num = 0, den = 0;
        int ntermos;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de termos do somatorio: ");
        ntermos = teclado.nextInt();        
        
        for (int aux = 1; aux <= ntermos; aux++)
        {
           num = 1 + Math.sqrt(aux*4);
           den = aux * 3;
           serie = serie + num / den;
        }

        System.out.println("Valor da série = " + serie);
        
        teclado.close();

    }
    
}