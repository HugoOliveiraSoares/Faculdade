/* Autor: Hugo Oliveira Soares - E01381 */
import java.util.Scanner;

public class E01381C {
    public static void main(String[] args) {

        String nome_corredor[] = new String[100];
        String temp_nome, pesquisa_corredor;
        int tempo[] = new int[100];
        int temp_tempo, encontra_pos = -1;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < tempo.length; aux++)
        {
            System.out.print("Digite o nome do corredor:");
            nome_corredor[aux] = teclado.nextLine();
            System.out.print("Digite o tempo final: ");
            tempo[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int aux = 0; aux < tempo.length - 1; aux++)
        {
            for (int i = 0; i < tempo.length - 1; i++)
            {    
                if (tempo[i] > tempo[i+1])
                {
                    temp_tempo = tempo[i];
                    tempo[i] = tempo[i+1];
                    tempo[i+1] = temp_tempo;

                    temp_nome = nome_corredor[i];
                    nome_corredor[i] = nome_corredor[i + 1];
                    nome_corredor[i + 1] = temp_nome;
                }
            }
        }

        System.out.print("Os 10 corredores mais rapidos: ");
        for (int aux = 0; aux < 10; aux++)
        {
            System.out.print(nome_corredor[aux]+" ");    
        }

        System.out.println("\nDigite o nome de um corredor para verificar se ele está entre os 10 mais rapidos: ");
        pesquisa_corredor = teclado.nextLine();

        for (int i = 0; i < 10; i++)
        {
            if (pesquisa_corredor.compareToIgnoreCase(nome_corredor[i]) == 0)
                encontra_pos = i;
        }

        if (encontra_pos != -1)
            System.out.println("O corredor "+nome_corredor[encontra_pos]+" está na posição "+(encontra_pos+1));
        else
            System.out.println("NÃO ENCONTRADO NA LISTA DOS 10 MAIS!");

        
        teclado.close();

    }
}