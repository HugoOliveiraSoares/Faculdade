import java.util.Scanner;

public class Ex07C13 {
    public static void main(String[] args) {
        
        String nome_aluno[] = new String[50];
        int nota[] = new int[50];

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < 5; aux++)
        {
            System.out.print("Digite o nome do aluno: ");
            nome_aluno[aux] = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int aux = 0; aux < 5; aux++)
        {
            if (nota[aux] <= 30)
                System.out.println("O conceito da nota do aluno "+nome_aluno[aux]+" é D");   
            else if(nota[aux] <= 60)
                System.out.println("O conceito da nota do aluno "+nome_aluno[aux]+" é C");
            else if(nota[aux] <= 80)
                System.out.println("O conceito da nota do aluno "+nome_aluno[aux]+" é B");
            else
                System.out.println("O conceito da nota do aluno "+nome_aluno[aux]+" é A");
        }
        
        teclado.close();

    }
}