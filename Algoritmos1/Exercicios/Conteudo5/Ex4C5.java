import java.util.Scanner;

public class Ex4C5 {
    // Função: Calculo da distância entre pontos
    // Autor: Hugo Oliveira Soares
    
    public static void main(String[] args) {
        
        double x1, x2, y1, y2, distancia;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o x do ponto1: ");
        x1 = teclado.nextDouble();
        System.out.print("Digite o y do ponto1: ");
        y1 = teclado.nextDouble();
        System.out.print("Digite o x do ponto2: ");
        x2 = teclado.nextDouble();
        System.out.print("Digite o y do ponto2: ");
        y2 = teclado.nextDouble();

        distancia = Math.sqrt( Math.pow( x1 - x2, 2) +  Math.pow( y1 - y2, 2) );

        System.out.printf("A distancia entre os pontos (%.0f,%.0f) e (%.0f,%.0f) é de: %.4f\n", x1, y1, x2, y2, distancia);

        teclado.close();

    }
}