/*
* Função: Le o nome, idade, sexo, estado civil, cor dos olhos, cor do cabelo, salario, e escolaridade de 50 pessoas.
* Quantidade de mulheres loiras, de olhos azuis, com idade
* entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo;
* Nome da pessoa com maior salário;
* Diferença entre o maior e menor salário dos homens.
* Autor: Hugo Oliveira Soares
*/

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        String nome, sexo, estadoCivil, corOlhos, corCabelos, nomeSalarioMaior = "";
        double salario, salarioMaior = 0, salarioMenor = 0, diferenca = 0, salarioMaiorM = 0;
        int escolaridade, idade, quantMulheres = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 5; aux++)
        {
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite a sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Digite o seu sexo: ");
            sexo = teclado.nextLine();
            System.out.print("Digite o seu estado civil: ");
            estadoCivil = teclado.nextLine();
            System.out.print("Digite a cor dos seus olhos: ");
            corOlhos = teclado.nextLine();
            System.out.print("Digite a cor do seu cabelo: ");
            corCabelos = teclado.nextLine();
            System.out.print("Digite o seu salario: ");
            salario = teclado.nextInt();
            System.out.print("Digite o seu nivel de escolaridade: ");
            escolaridade = teclado.nextInt();
            teclado.nextLine();

            if (sexo.equalsIgnoreCase("F") && corCabelos.equalsIgnoreCase("L") && corOlhos.equalsIgnoreCase("A") && (idade >= 18 && idade <= 25) && estadoCivil.equalsIgnoreCase("S") && salario > 10000 && escolaridade == 4)  
                quantMulheres++;

            if (aux == 1 || salario > salarioMaior) 
            {
                salarioMaior = salario;
                nomeSalarioMaior = nome;
            }

            if (sexo.equalsIgnoreCase("M")) 
            {
                if (aux == 1 || salario > salarioMaior) 
                    salarioMaiorM = salario;
                
                if (aux == 1 || salario < salarioMenor) 
                    salarioMenor = salario;
            }   
        }

        diferenca = salarioMaiorM - salarioMenor;

        System.out.println("A quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00: " + quantMulheres);
        System.out.println("Pessoa com maior salario: " + nomeSalarioMaior);
        System.out.printf("Diferença entre o maior e menor salário dos homens: %.2f \n" , diferenca);

        teclado.close();

    }

}