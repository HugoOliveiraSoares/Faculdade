import java.util.Scanner;

public class Ex04C13 {
    public static void main(String[] args) {
        
        int vet[] = new int[10];

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < vet.length; aux++)
        {
            System.out.print("Digite um número: ");
            vet[aux] = teclado.nextInt();
        }

        for (int aux= 0; aux < vet.length; aux++)
        {
            System.out.println(Math.pow(vet[aux], 2));
        }

        teclado.close();

    }
}