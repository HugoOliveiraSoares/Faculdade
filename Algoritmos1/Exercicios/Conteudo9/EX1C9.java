/**
 * EX1C9
 */
public class EX1C9 {

    public static void main(String[] args) {

        double serie = 0, num, den = 0;

        for (int aux = 37; aux >= 1; aux--)
        {
           num = aux * (aux + 1);
           den = 38 - aux;
           serie = serie + num / den;
        }
        
        System.out.println("Valor da série = " + serie);
    }
}