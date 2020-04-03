import java.util.Scanner;

public class Ex8C5 {
    // Função: Calculo do raio de um setor circular
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double setorCircular, angulo, raio;
        double pi = 3.1416;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a área de um setor circular: ");
        setorCircular = teclado.nextDouble();
        System.out.print("Digite o angulo do setor: ");
        angulo = teclado.nextDouble();

        raio = Math.sqrt( (360*setorCircular) / (angulo *pi) );

        System.out.println("O valor do raio do setor circular é de: " + raio );
        
        teclado.close();
        
    }

}