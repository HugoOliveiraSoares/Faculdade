import java.util.Scanner;

public class Exercicio7 {
    // Função: Calcula a função f(x) = raiz( (x/4 + 1)² + (1/5)x )
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double fx, x;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();

        fx = Math.sqrt( Math.pow(x/4.0 + 1, 2) + (1/5.0)*x );

        System.out.println("O resultado da função é: " + fx);

        teclado.close();
    }

    
}