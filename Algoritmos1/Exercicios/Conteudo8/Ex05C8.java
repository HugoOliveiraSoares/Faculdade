/*
*
* Função: Apura as eleições de uma cidade  com 3 candidatos 
* Autor: Hugo Oliveira Soares
*
*/

// import java.util.Random;
import java.util.Scanner;

public class Ex05C8 {
    public static void main(String[] args) {

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, voto = 0;
        
        Scanner teclado = new Scanner(System.in);
        // Random gerador = new Random();
        
        for (int x = 1; x <= 100; x++)
        {
            System.out.print("1-Fulano 2-Ciclano 3-Beltrano \n Digite o seu voto: ");
            voto = teclado.nextInt();
            // voto = gerador.nextInt(3) + 1; // Gera votos aleatorios
            // System.out.println(voto);

            if (voto ==  1) 
            {
                candidato1++;
                
            }else if (voto == 2) 
            {
                candidato2++;

            } else if(voto == 3)
            {
                candidato3++;
            }else
            {
                System.out.println("Opção invalida");
            }
        }

        if (candidato1 > candidato2 && candidato1 > candidato3 ) 
        {
            System.out.println("Candidato Fulano eleito.");
        }else if (candidato2 > candidato1 && candidato2 > candidato3 ) 
        {
            System.out.println("Candidato Ciclano eleito.");
        }else if (candidato3 > candidato1 && candidato3 > candidato2)
        {
            System.out.println("Candidato Beltrano eleito.");
        }
        
        teclado.close();
    }
}