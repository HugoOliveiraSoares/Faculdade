import java.util.Scanner;

public class Ex10C5 {
    // Função: Le um numero de 5 digitos e o imprime na vertical 
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args){
        
        int numero, n1, n2, n3, n4, n5;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        n1 = numero / 10000;
        n2 = numero / 1000 % 10;
        n3 = numero / 100 % 10;
        n4 = numero / 10 % 10;
        n5 = numero % 10;

        System.out.println( n1 );
        System.out.println( n2 );
        System.out.println( n3 );
        System.out.println( n4 );
        System.out.println( n5 );

        teclado.close();

    }

}