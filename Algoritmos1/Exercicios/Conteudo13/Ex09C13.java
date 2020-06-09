import java.util.Scanner;

public class Ex09C13 {
    public static void main(String[] args) {
        
        int vet[] = new int[10];
        int somatorio = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < vet.length; aux++)
        {
            System.out.print("Digite um número inteiro: ");
            vet[aux] = teclado.nextInt();
            somatorio += vet[aux];
        }

        for (int aux = 0; aux < vet.length; aux++)
        {
            if (somatorio % vet[aux] == 0)
            {
                System.out.println("O número "+vet[aux]+" é divisor de "+ somatorio);
            }  
        }

        teclado.close();

    }
}