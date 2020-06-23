import java.util.Scanner;

public class Ex14C13 {
    public static void main(String[] args) {
        
        String cidade[] = new String[100];
        String estado[] = new String[100];
        int populacao[] = new int[100];
        int temp_pop = 0;
        String temp_cidade = "", temp_estado = "";

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < 100; aux++) {
            System.out.print("Digite o nome da cidade: ");
            cidade[aux] = teclado.nextLine();
            System.out.print("Digite o nome do estado: ");
            estado[aux] = teclado.nextLine();
            System.out.println("Digite a população desse estado: ");
            populacao[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int i = 0; i < populacao.length -1; i++) {
            for (int aux = 0; aux < populacao.length -1; aux++) {
                if (populacao[aux] > populacao[aux+1]) 
                {
                    temp_pop = populacao[aux];
                    populacao[aux] = populacao[aux+1];
                    populacao[aux+1] = temp_pop;
                    
                    temp_cidade = cidade[aux];
                    cidade[aux] = cidade[aux + 1];
                    cidade[aux + 1] = temp_cidade;

                    temp_estado = estado[aux];
                    estado[aux] = estado[aux + 1];
                    estado[aux + 1] = temp_estado;

                }
            }
        }

        for (int i = populacao.length - 1; i > populacao.length - 6; i--)
        {
            System.out.print(populacao[i]+" - ");
            System.out.print(cidade[i]+" - ");
            System.out.print(estado[i]+" - ");
        }        
        teclado.close();

    }

}
