import java.util.Scanner;

public class Ex13C6 {
    // Função: Calcula e imprime a duração de um jogo
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {

        int horaInicial, horaFinal, minutoInicial, minutoFinal, horas, minutos;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        horaInicial = teclado.nextInt();

        System.out.print("Digite a minuto inicial do jogo: ");
        minutoInicial = teclado.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        horaFinal = teclado.nextInt();
        
        System.out.print("Digite a minuto final do jogo: ");
        minutoFinal = teclado.nextInt();
        

        horas = horaFinal - horaInicial;

        if (minutoInicial > minutoFinal) 
        {
            minutos = 60 - (minutoInicial - minutoFinal);
            horas--;

        } else 
        {    
            minutos = minutoFinal - minutoInicial;

        }

        System.out.println("O jogo durou " + horas + " e " + minutos + " minutos.");

        teclado.close();
        
    }
}