import java.util.Scanner;

public class Ex11C6 {
    // Função: Calcula a distribuição de pontos dos times de voilei
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        String equipe1, equipe2;
        int sets_equipe1, sets_equipe2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome da equipe 1: ");
        equipe1 = teclado.nextLine();

        System.out.print("Digite o nome da equipe 2: ");
        equipe2 = teclado.nextLine();

        System.out.print("Sets ganhos da equipe 1: ");
        sets_equipe1 = teclado.nextInt();

        System.out.print("Sets ganhos da equipe 2: ");
        sets_equipe2 = teclado.nextInt();

        if ( (sets_equipe1 == 3 && sets_equipe2 == 0) || (sets_equipe1 == 3 && sets_equipe2 == 1) ) 
        {
            System.out.println("Pontos " + equipe1 + " = 3   Pontos " + equipe2 + " = 0");

        } else if( (sets_equipe2 == 3 && sets_equipe1 == 0) || (sets_equipe2 == 3 && sets_equipe1 == 1) )
        {
            System.out.println("Pontos " + equipe1 + " = 0   Pontos " + equipe1 + " = 3");
            
        } else if (sets_equipe1 == 3 && sets_equipe2 == 2) 
        {
            System.out.println("Pontos " + equipe1 + " = 2   Pontos " + equipe2 + " = 1");

        } else if(sets_equipe1 == 2 && sets_equipe2 == 3)
        {
            System.out.println("Pontos " + equipe1 + " = 1   Pontos " + equipe2 + " = 2");
            
        }else
        {
            System.out.println("Pontos " + equipe1 + " = 2   Pontos " + equipe2 + " = 2");
        }

        teclado.close();

    }
    
}