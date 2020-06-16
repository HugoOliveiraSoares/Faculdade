import java.util.Scanner;

public class Ex10C13 {
    public static void main(String[] args) {
        
        String nome_aluno[] = new String[50];

        int nota[] = new int[8];
        double media_notas, somatorio_notas = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < nota.length; aux++)
        {
            System.out.print("Digite nome do aluno: ");
            nome_aluno[aux] = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();

            somatorio_notas += nota[aux];
        }

        media_notas = somatorio_notas / nota.length;
        System.out.println();

        for (int aux = 0; aux < nota.length; aux++)
        {
            if (nota[aux] > media_notas)
            {
                System.out.println(nome_aluno[aux]+" ficou com a nota a cima da media.");   
            }
        }

        teclado.close();
    }
}