import java.util.Scanner;

public class Ex5C9 {

    public static void main(String[] args) {

        int ntermos;
        double serie = 0, num, den;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de termos do somatorio: ");
        ntermos = teclado.nextInt();

        for (int aux = 0, aux1 = 7; aux < ntermos; aux++, aux1+=6)
        {
            num = aux * 2 + (aux + 1) * 3;
            den = aux1;
            serie = serie + num / den;
        }

        serie = 5 * serie;
        System.out.println("Valor da série = " + serie);

        teclado.close();

    }
    
}