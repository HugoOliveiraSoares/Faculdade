/*
*
* Função: Verifica se os alunos foram aprovados ou não, e informa quantos aprovados e quantos reprovados
* Autor: Hugo Oliveira Soares
*
*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        double nota;
        int faltas, aprovado = 0, reprovado = 0;

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
                aprovado++;
                
            }else
            {
                System.out.println("Aluno Reprovado");
                reprovado++;
            }
        }

        System.out.println("Alunos aprovados " + aprovado);
        System.out.println("Alunos reprovados " + reprovado);
        
        teclado.close();
    }
}