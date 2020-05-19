/*
*
* Função: Le 10 números e verifica se é par ou impar, a soma dos divisiveis por 4 e a quant. dos divisiveis por 3.
* Autor: Hugo Oliveira Soares
*
*/

import java.util.Scanner;

public class Ex06C8 {

    public static void main(String[] args) {
        
        int numero, somaDiv4 = 0, quantDiv3 = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int x = 0; x <= 9; x++)
        {
            System.out.print("Digite um número inteiro: ");
            numero = teclado.nextInt();

            if (numero % 2 == 0) 
            {
                System.out.println("O número "+numero+" é par.");
            }else
            {
                System.out.println("O número "+numero+" é impar.");
            }

            if (numero % 4 == 0) 
            {
                somaDiv4 = numero + somaDiv4;

            }
            
            if(numero % 3 == 0)
            {
                quantDiv3++;
            }

        } // END FOR

        System.out.println("A soma dos divisiveis por 4 = "+somaDiv4);
        System.out.println("Quantidade de números divisiveis por 3 = "+quantDiv3);
        
        teclado.close();

    }

}