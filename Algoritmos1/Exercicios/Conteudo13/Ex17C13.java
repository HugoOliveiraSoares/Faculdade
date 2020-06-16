import java.util.Scanner;

public class Ex17C13 {
    public static void main(String[] args) {
        
        int vetor[] = new int[10];
        int vetor_inverso[] = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < vetor.length; aux++) {
            System.out.print("Digite um número inteiro: ");
            vetor[aux] = teclado.nextInt();
        }

        for (int aux = 0, i = vetor_inverso.length - 1; aux < 10; aux++, i--)
        {    
                vetor_inverso[i] = vetor[aux];
        }

        for (int x = 0; x < vetor_inverso.length; x++) {
            System.out.println(vetor_inverso[x]);
        }

        teclado.close();
    }
}