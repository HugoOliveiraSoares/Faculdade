import java.util.Scanner;

public class Ex06C13 {
    public static void main(String[] args) {
        
        String meses[] = new String[12];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < meses.length; aux++)
        {
            System.out.print("Digite o nome do mes: ");
            meses[aux] = teclado.nextLine();
        }

        for (int aux = (meses.length - 1); aux >= 0; aux--)
        {
            System.out.println(meses[aux]);
        }
        
        teclado.close();

    }
}