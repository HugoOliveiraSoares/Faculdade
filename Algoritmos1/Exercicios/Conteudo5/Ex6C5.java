import java.util.Scanner;

public class Ex6C5 {
    // Função: Calculo da distancia de uma reta a um ponto
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double x, y, distancia; // RETA P
        double a, b, c; // RETA R

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o A de uma reta: ");
        a = teclado.nextDouble();
        System.out.print("Digite o B de uma reta: ");
        b = teclado.nextDouble();
        System.out.print("Digite o C de uma reta: ");
        c = teclado.nextDouble();
        System.out.print("Digite a coordenada x: ");
        x = teclado.nextDouble();
        System.out.print("Digite a coordenada y: ");
        y = teclado.nextDouble();

        distancia = (a*x + b*y + c) / Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );

        System.out.println("A distancia entre o ponto e a reta é de: " + distancia );

        teclado.close();

    }
}