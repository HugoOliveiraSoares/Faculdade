import java.util.Scanner;

public class Ex9C5 {
    // Função: Media das notas (media ponderada)
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        float nota1, nota2, nota3, media;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a nota 1: ");
        nota1 = teclado.nextFloat();
        System.out.print("Digite a nota 2: ");
        nota2 = teclado.nextFloat();
        System.out.print("Digite a nota 3: ");
        nota3 = teclado.nextFloat();
        
        media = ((nota1*2) + (nota2*3) + (nota3*5)) / (2 + 3 + 5);

        System.out.println("A mdeia do aluno na etapa é: " + media );

        teclado.close();
    }
}