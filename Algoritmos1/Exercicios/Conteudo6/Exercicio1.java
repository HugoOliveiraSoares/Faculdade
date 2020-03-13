import java.util.Scanner;

public class Exercicio1{

    public static void main(String[] args){
        // Função: Calcula o valor de fx conforme a 
        // função {(5x + 3)/raiz(16-x²), se x < 4; 0, se x = 4; (5x + 3)/raiz(x² - 16), se x > 4 }
        // Autor: Hugo Oliveira Soares

        double fx = 0;
        double x = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero para x: ");
        x = teclado.nextDouble();
        
        if( x < 4 ){
            
            fx = (5*x + 3) / Math.sqrt(16 - Math.pow(x,2));
        
        }else if(x == 4 ){
            
            fx = 0;
            
        }else if( x >= 4 ){
            
            fx = (5*x + 3) / Math.sqrt(Math.pow(x,2) - 16);
        }
        
        System.out.println("O resultado da função é: " + fx);

        teclado.close();
	}
}