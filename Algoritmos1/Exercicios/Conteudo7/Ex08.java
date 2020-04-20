/*
*
* Função: Le a nota final e o total de faltas de todos os 50 alunos e informa a media dos aprovados 
* e quantos alunos que tiveram mais de 16  faltas
* Autor: Hugo Oliveira Soares
*
*/

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        
        double nota, mediaNotasAprovados = 0, somaNotas = 0;
        int faltas, aprovado = 0, alunoMais16f = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) 
        {
            System.out.print("Digite a nota do aluno: ");
            nota = teclado.nextDouble();
            System.out.print("Digite o número de faltas: ");
            faltas = teclado.nextInt();

            if (nota >= 65 && faltas <= 16) 
            {
                System.out.println("Aluno Aprovado");
                aprovado++;
                somaNotas = nota + somaNotas;

            } else
            {
                System.out.println("Aluno Reprovado");
            }

            if (faltas > 16) 
                alunoMais16f++;

        }

        mediaNotasAprovados = (float) somaNotas / aprovado;

        System.out.printf("A media dos alunos aprovados: %.2f \n",mediaNotasAprovados);
        System.out.println("A quantidade de alunos com mais de 16 faltas: "+alunoMais16f);

        teclado.close();

    }

}