import java.util.Arrays;
import java.util.Scanner;

public class Ex13C13 {
    public static void main(String[] args) {
        
        String meses[] = new String[12];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < meses.length; aux++)
        {
            System.out.print("Digite os meses: ");
            meses[aux] = teclado.nextLine();
        }

        Arrays.sort(meses);

        System.out.println(Arrays.toString(meses));



        teclado.close();

    }
}