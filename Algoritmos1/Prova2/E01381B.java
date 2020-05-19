/*
*
* Autor: Hugo Oliveira Soares
*
*/
import java.util.Scanner;
public class E01381B {
    public static void main(String[] args) {
        
        int golsAtletico, golsCruzeiro, contVitoriasA = 0, contVitoriasC = 0, somagols = 0, diferenca = 0, placar = 0, placarMaior = 0;
        float media;
        String data;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 5; aux++)
        {
            System.out.print("Digite a data do jogo: ");
            data = teclado.nextLine();
            System.out.print("Digite a quantidade de gols do Ateltico: ");
            golsAtletico = teclado.nextInt();
            System.out.print("Digite a quantidade de gols do Cruzeiro: ");
            golsCruzeiro = teclado.nextInt();
            teclado.nextLine();
            
            if (golsAtletico > golsCruzeiro)
            {
                System.out.println("Atletico é a equipe vencedora!");
                contVitoriasA++;
                somagols += golsAtletico;
            }
            else if(golsCruzeiro > golsAtletico)
            {
                System.out.println("Cruzeiro é a equipe vencedora!");
                contVitoriasC++;
            }
            else
                System.out.println("Empate");

            placar = golsCruzeiro + golsAtletico;
            if(aux == 1 || placar > placarMaior)
            {
                placarMaior = placar;
                diferenca = golsAtletico - golsCruzeiro;
                diferenca = (diferenca < 0) ? diferenca *= -1 : diferenca; // Garante que a diferença não fique com valor negativo
            }
        }

        System.out.println("Quantidade de vitorias do Ateltico: " + contVitoriasA);
        System.out.println("Quantidade de vitorias do Cruzeiro: " + contVitoriasC);
        
        media = (float) somagols / contVitoriasA;
        System.out.println("Média de gols do Atletico de partidas vitoriosas: "+media);

        System.out.println("A maior diferença de placar foi de: "+diferenca);

        if(contVitoriasA > contVitoriasC)
            System.out.println("A equipe que mais vezes ganhou o clássico foi o Atletico");
        else if(contVitoriasA < contVitoriasC)
            System.out.println("A equipe que mais vezes ganhou o clássico foi o Cruzeiro");
        else
            System.out.println("EQUIPES EMPATADAS");

        teclado.close();

    }
}