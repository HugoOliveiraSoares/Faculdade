import java.util.Scanner;

public class Ex4C9 {
    
    public static void main(String[] args) {
        
       double serie = 0, num = 0, den = 0, ntermos;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de termos do somatorio: ");
        ntermos = teclado.nextInt();

        for (int aux = 1; aux <= ntermos; aux++)
        {
            num = (aux * 4 - 3) * (aux * 4 - 2);
            den = (aux * 4 - 1) * (aux * 4);
            serie += num / den;
        }

        serie = Math.sqrt(serie);
        System.out.println("Valor da série = " + serie);

        teclado.close();

    }
    
}