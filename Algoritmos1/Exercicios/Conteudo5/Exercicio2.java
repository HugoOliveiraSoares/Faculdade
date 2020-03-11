import java.util.Scanner;

public class Exercicio2 {
    // Função: Calcula área e volume
    // Autor: Hugo Oliveira Soares
    
    public static void main(String[] args) {
        
        double raio, area, volume;
        double pi = 3.1416;

         Scanner teclado = new Scanner(System.in);
         System.out.print("Digite um valor para o raio: ");
         raio = teclado.nextDouble();

         area = 4*pi * Math.pow(raio ,2);
         volume = (4.0 / 3) * pi * Math.pow(raio, 3);

         System.out.printf("A área vale: %.2f\n", area);
         System.out.printf("O volume vale: %.1f\n", volume);

         teclado.close();

    }
}