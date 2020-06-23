import java.util.Scanner;

public class Ex25C13 {
    public static void main(String[] args) {
        
        String times[] = new String[20];
        int pontuacao[] = new int[20];
        int temp_pont = 0, posicao = 0;
        String temp_time = "", pesquisa;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < times.length; aux++)
        {
            System.out.print("Digite o nome de um time: ");
            times[aux] = teclado.nextLine();
            System.out.print("Digite a pontuação do time: ");
            pontuacao[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int aux = 0; aux < times.length - 1; aux++)
        {
            for (int i = 0; i < times.length - 1; i++)
            {
                if (pontuacao[i] < pontuacao[i+1])
                {
                    temp_pont = pontuacao[i];
                    pontuacao[i] = pontuacao[i+1];
                    pontuacao[i+1] = temp_pont;

                    temp_time = times[i];
                    times[i] = times[i + 1];
                    times[i+1] = temp_time;
                }
            }            
        }

        System.out.print("Digite o nome de um time para saber a sua posição: ");
        pesquisa = teclado.nextLine();

        for (int aux = 0; aux < times.length; aux++)
            if (pesquisa.compareToIgnoreCase(times[aux]) == 0)
                posicao = aux + 1;
        
        if(posicao <= 4)
            System.out.println("O time "+times[posicao - 1]+" está na posição "+posicao+" e sua situação é Copa Libertadoeres.");
        else if(posicao <= 12)
            System.out.println("O time "+times[posicao - 1]+" está na posição " +posicao+" e sua situação é Copa Sul-Americana.");
        else if(posicao <= 20)
            System.out.println("O time "+times[posicao - 1]+" está na posição " +posicao+" e sua situação é Rebaixado.");
        else
            System.out.println("O time informado não foi encontrado!");

        teclado.close();

    }
}