/*
* Função: Calcula o peso de uma pessoa para que fique no IMC ideal
* Autor: Hugo Oliveira Soares
* Data: 03/04/2020
*/

import java.util.Scanner;

public class E01381A {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        double pesoP1, pesoP2, alturaP1, alturaP2, imcP1, imcP2, pesoIdeal;
        
        System.out.print("Digite a altura da 1ª pessoa: ");
        alturaP1 = teclado.nextDouble();

        System.out.print("Digite o peso da 1ª pessoa: ");
        pesoP1 = teclado.nextDouble();

        System.out.print("Digite a altura da 2ª pessoa: ");
        alturaP2 = teclado.nextDouble();

        System.out.print("Digite o peso da 2ª pessoa: ");
        pesoP2 = teclado.nextDouble();

        imcP1 = pesoP1 / Math.pow(alturaP1, 2);
        imcP2 = pesoP2 / Math.pow(alturaP2, 2);

        if (imcP1 != imcP2) 
        {
            pesoIdeal = imcP1 * Math.pow(alturaP2, 2);
            System.out.println("Peso da 2ª pessoa para ficar com IMC igual ao da 1ª pessoa é = "+pesoIdeal);
            
        } else {

            System.out.println(" O IMC é igual!");
            
        }
        
        teclado.close();
        
    }

    
}