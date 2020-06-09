import java.util.Scanner;

public class Ex01C13 {
    public static void main(String[] args) {
        
        int vet[] = new int[10];
        int cont_div = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < vet.length; aux++)
        {
            System.out.print("Digite um número: ");
            vet[aux] = teclado.nextInt();
        }

        for (int aux = 0; aux < vet.length; aux++)
        {
            if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0)
            {
                cont_div++;
            }
        }

        System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: "+cont_div);
        
        teclado.close();

    }
}