import java.util.Scanner;

public class Ex1C5{
    // Função: Calcula a função f(x) = x³ + 4x + 10
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args){
        
        double fx, x;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe um valor para x: ");
        x =  teclado.nextDouble();
        
        fx = Math.pow(x,3) + 4*x + 10;
        
        System.out.println("O valor de f(x) é: " + fx);

        teclado.close();

    }
}