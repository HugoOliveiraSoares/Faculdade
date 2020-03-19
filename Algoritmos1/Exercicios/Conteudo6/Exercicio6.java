import java.util.Scanner;

public class Exercicio6 {
    // Função: Calcula e imprimi as raízes da função f(x) 
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double a, b, c, delta, raiz, _raiz = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("f(x = Ax² + Bx + C Digite os valores para a função");
        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        delta = Math.pow(b, 2) - 4*a*c;

        if (delta > 0) 
        {
            raiz = (-b + Math.sqrt(delta)) / (2 * a);
            _raiz = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("A = " + a + ", B = " + b + " e C = " + c + " teremos 2 raizes = " + raiz +" "+ _raiz );

        }else if (delta < 0) 
        {
            System.out.println("A = " + a + ", B = " + b + " e C = " + c + " não teremos raiz");
        }else
        {
            raiz = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("A = " + a + ", B = " + b + " e C = " + c + "teremos 1 raiz = " + raiz);
        }


        teclado.close();

    }

    
}