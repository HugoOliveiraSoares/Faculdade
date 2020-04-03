import java.util.Scanner;

public class Ex12C5 {
    // Função: Le um tempo de duraçãoem segundos e p mostra expresso em horas, minutos e segundos
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args){
         int hora, minutos, segundos, tempoSegundos;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tempo de duração de um evento em segundos: ");
        tempoSegundos = teclado.nextInt();

        hora = tempoSegundos / 3600;
        minutos = (tempoSegundos - ( hora * 3600)) / 60;
        segundos = (tempoSegundos - hora * 3600) - (minutos * 60);
        
        System.out.printf("%d:%d:%d",hora, minutos, segundos);
        
        teclado.close();

        
    }

}