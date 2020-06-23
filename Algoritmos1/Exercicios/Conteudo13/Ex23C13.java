import java.util.Scanner;

public class Ex23C13 {
    public static void main(String[] args) {
        
        int num[] = new int[10];
        int num_div3[] = new int[10];
        int cont_div3 = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < num.length; aux++)
        {
            System.out.print("Digite um número inteiro: ");
            num[aux] = teclado.nextInt();

            if(num[aux] % 3 == 0)
            {
                num_div3[cont_div3] = num[aux];
                cont_div3++;
            }
        }

        System.out.print("Números divisiveis por 3: ");
        for (int i = 0; i < cont_div3; i++)
        {
            System.out.print(num_div3[i]+" ");
        }

        System.out.println();


        teclado.close();

    }
}