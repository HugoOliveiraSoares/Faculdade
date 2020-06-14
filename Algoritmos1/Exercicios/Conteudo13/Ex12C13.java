import java.util.Scanner;

public class Ex12C13 {
    public static void main(String[] args) {

        String nome_aluno[] = new String[50];

        int nota[] = new int[8];
        int indice_notaMaior[] = new int [8];
        int notaMaior = 0, quant_notaMaior = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < nota.length; aux++)
        {
            System.out.print("Digite nome do aluno: ");
            nome_aluno[aux] = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int aux = 0; aux < nota.length; aux++)
        {
            if (aux == 1 || nota[aux] > notaMaior)
            {
                notaMaior = nota[aux];
                indice_notaMaior[aux] = aux;
                quant_notaMaior++;
            }
        }

        for (int aux = 0; aux < quant_notaMaior; aux++) 
        {
            System.out.println("O aluno de maior nota é " + nome_aluno[indice_notaMaior[aux]]);
        }

        teclado.close();

    }
}