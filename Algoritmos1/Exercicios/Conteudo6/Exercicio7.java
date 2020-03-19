import java.util.Scanner;

public class Exercicio7 {
    // Função: Calcula o valor de participação nos lucros (PL liquido) de um empregado em uma empresa.
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double salario, plLiquido, plBruto, impostoRenda;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salario de um dos empregados da empresa: ");
        salario = teclado.nextFloat();

        if (salario <= 300) 
        {
            plBruto = 500 + salario * 0.7;

        }else if(salario > 300 && salario <= 1000)
        {
            plBruto = 200 + salario * 0.5;

        }else{

            plBruto = salario * 0.3;  
        }

        impostoRenda = 0.25 * plBruto;
        plLiquido = plBruto - impostoRenda;

        // System.out.printf("O PL Liquido é de: %.2f \n", plLiquido);
        System.out.println("O PL Liquido é de: " + plLiquido);
        
        teclado.close();

    }
}