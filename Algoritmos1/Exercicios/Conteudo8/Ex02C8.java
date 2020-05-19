/*
*
* Função: Verifica se os alunos foram aprovados ou não
* Autor: Hugo Oliveira Soares
*
*/
import java.util.Scanner;

public class Ex02C8 {
    public static void main(String[] args) {

        double nota;
        int faltas;

        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 50; i++) 
        {
            System.out.print("Digite a nota do aluno: ");
            nota = teclado.nextDouble();
            System.out.print("Digite o número de faltas: ");
            faltas = teclado.nextInt();

            if (nota >= 65 && faltas < 16) 
            {
                System.out.println("Aluno Aprovado");
                
            }else
            {
                System.out.println("Aluno Reprovado");
            }
        }
        
        teclado.close();
    }
}