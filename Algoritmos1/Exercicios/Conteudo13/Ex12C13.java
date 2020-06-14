import java.util.Scanner;

public class Ex12C13 {
    public static void main(String[] args) {

        String nome_aluno[] = new String[50];
        int nota[] = new int[8];
        int indice_notaMaior = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < nota.length; aux++)
        {
            System.out.print("Digite nome do aluno: ");
            nome_aluno[aux] = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        System.out.println("As notas maiores são de: ");
        for (int aux = 1; aux < nota.length; aux++)
        {
            if (nota[aux] >= nota[indice_notaMaior])
            {
                indice_notaMaior = aux;
                System.out.println(nome_aluno[indice_notaMaior]);
            }
        }
        

        teclado.close();

    }
}