import java.util.Scanner;

public class Ex05C13 {
    public static void main(String[] args) {
        
        int vet[] = new int[10];
        int num_maior = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < vet.length; aux++)
        {
            System.out.print("Digite um número: ");
            vet[aux] = teclado.nextInt();
        }

        for (int aux= 0; aux< vet.length; aux++)
        {
            if (aux == 1 || vet[aux] > num_maior) num_maior = vet[aux];
        }

        System.out.println("Maior valor: "+num_maior);

        teclado.close();

    }
}