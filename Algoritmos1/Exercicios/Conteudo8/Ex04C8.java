/*
*
* Função: Le o nome e a idade de 50 alunos e calcula quantos tem ate 18 anos e quantos tem mais de 18
* Autor: Hugo Oliveira Soares
*
*/
import java.util.Scanner;

public class Ex04C8 {

    public static void main(String[] args) {
        
        String nome;
        int idade, ate18 = 0, acima18 = 0;

        Scanner teclado = new Scanner(System.in);

        for (int x = 1; x <= 5; x++)
        {
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Digite a sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();

            if (idade <= 18)
                ate18++;
            else
                acima18++;

        }

        System.out.println("Alunos que tem até de 18 anos: " + ate18);
        System.out.println("Alunos que tem mais de 18 anos: " + acima18);

        teclado.close();

    }

}