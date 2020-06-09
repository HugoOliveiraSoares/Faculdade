import java.util.Scanner;

public class Ex08C13 {
    public static void main(String[] args) {
        
        int vet[] = new int[20];
        int soma;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < vet.length; aux++)
        {
            System.out.print("Digite um número inteiro: ");
            vet[aux] = teclado.nextInt();
        }

        for (int aux = 0; aux < vet.length - 10; aux++)
        {
            soma = vet[aux] + vet[aux+10];
            System.out.println(soma);
        }

        
        teclado.close();

    }
}