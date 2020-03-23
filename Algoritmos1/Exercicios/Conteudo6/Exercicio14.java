import java.util.Scanner;

public class Exercicio14 {
    // Função: Le um número inteiro de 4 digitos e o imprime de tras para frente 
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) 
    {
        int num, n1, n2, n3, n4;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de 4 digitos: ");
        num = teclado.nextInt();

        int contarDigitos = (int) (Math.log10(num) + 1);

        if (contarDigitos == 4) 
        {
            n1 = num / 1000;
            n2 = num / 100 % 10;
            n3 = num / 10 % 10;
            n4 = num % 10;

            System.out.print(n4);
            System.out.print(n3);
            System.out.print(n2);
            System.out.print(n1);
            System.out.println();
            
        } else 
        {
            System.out.println("Digite um número de 4 digitos.");
        }

        teclado.close();
    }

}