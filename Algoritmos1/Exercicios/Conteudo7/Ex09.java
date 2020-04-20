/*
*
* Função: Le o nome, a idade e o sexo e imprima a idade media dos homens e mulheres
* A quantidade de pessoas deve ser informada no inicio do programa
* Autor: Hugo Oliveira Soares
*
*/

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        int idade, somaIdadeF = 0,somaIdadeM = 0, quantHomens = 0, quantMulheres = 0, quantPessoas = 0;
        double mediaF, mediaM;
        String nome, sexo;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas a serem cadastradas: ");
        quantPessoas = teclado.nextInt();
        teclado.nextLine();
        
        for (int aux = 1; aux <= quantPessoas; aux++)
        {
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();
            
            System.out.print("Digite a sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            
            System.out.print("Digite o seu sexo: ");
            sexo = teclado.nextLine();

            if (sexo.equalsIgnoreCase("F")) 
            {
                quantMulheres++;
                somaIdadeF = somaIdadeF + idade;

            } else if(sexo.equalsIgnoreCase("M"))
            {
                quantHomens++;
                somaIdadeM = somaIdadeM + idade;
            }

        }

        mediaF = (double) somaIdadeF / quantMulheres;
        mediaM = (double) somaIdadeM / quantHomens;

        System.out.println("Média das idades dos homens = "+ mediaM);
        System.out.println("Média das idades das mulheres = "+ mediaF);
        
        teclado.close();

    }

}