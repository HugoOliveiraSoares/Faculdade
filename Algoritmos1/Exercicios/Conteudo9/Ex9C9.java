import java.util.Scanner;

public class Ex9C9 {
    public static void main(String[] args) {

        int ntermos;
        double serie = 0, num , den;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de termos da serie: ");
        ntermos = teclado.nextInt();
        
        for (int aux = 1; aux <= ntermos; aux++)
        {
            num = Math.pow(3, aux+1);
            den = (aux + 9) * Math.sqrt(Math.pow(aux, 4));
            serie += num / den;
        }

        serie = 100 - Math.pow(serie, 3);
        System.out.println("Valor da série = " + serie);        
        teclado.close();
        
    }
}