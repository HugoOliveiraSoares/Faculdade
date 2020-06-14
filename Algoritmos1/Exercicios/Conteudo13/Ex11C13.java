import java.util.Scanner;

public class Ex11C13 {
    public static void main(String[] args) {
        
        String nome_aluno[] = new String[50];

        int nota[] = new int[50];
        int indice_notaMaior = 0, notaMaior = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < nota.length; aux++)
        {
            System.out.print("Digite nome do aluno: ");
            nome_aluno[aux] = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int aux = 0; aux < nota.length; aux++) {
            if (aux == 1 || nota[aux] > notaMaior) 
            {
                notaMaior = nota[aux];   
                indice_notaMaior = aux;   
            }
        }

        System.out.println("O aluno de maior nota é "+nome_aluno[indice_notaMaior]);

        teclado.close();

    }
}