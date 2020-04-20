import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        
        String nome[] = new String[5];
        int idade[] = new int[5], idadeMaior = 0, SomaIdade = 0, quantIda12 = 0, quantAcima30 = 0, aux, y = 0;
        double mediaIdade = 0;

        Scanner teclado = new Scanner(System.in);

        for (aux = 0; aux <= 4; aux++)
        {
            System.out.print("Digite o nome do aluno: ");
            nome[aux] = teclado.nextLine();

            System.out.print("Digite a idade do aluno: ");
            idade[aux] = teclado.nextInt();
            teclado.nextLine();

            if(idade[aux] <= 12)
            {
                quantIda12++;
            }

            if (idade[aux] > 30) 
            {
                quantAcima30++;  
            }

            SomaIdade = SomaIdade + idade[aux];

        }
        

        for (int x = 0; x < aux; x++)
        {
            if (x == 1 || idade[x] > idadeMaior) 
            {
                idadeMaior = idade[x];
                y = x;
            }
        }

        mediaIdade = (float) SomaIdade / 5;

        System.out.println("Alunos ate 12 anos: "+quantIda12);
        System.out.println("Alunos acima de 30 anos: "+quantAcima30);
        System.out.printf("Media das idades: %.2f \n",mediaIdade);
        System.out.println("O aluno de idade maior é: " + nome[y]);

        teclado.close();
        
    }

}