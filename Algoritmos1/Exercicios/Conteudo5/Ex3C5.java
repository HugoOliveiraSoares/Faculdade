import java.util.Scanner;

public class Ex3C5 {
    // Função: Calculo de imposto de renda
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double impostoRenda, salario, salarioLiquido, numDependtes;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o salario: ");
        salario = teclado.nextDouble();
        System.out.print("Informe o número de dependentes: ");
        numDependtes = teclado.nextDouble();

        salarioLiquido = salario - (numDependtes * 60);
        impostoRenda = salarioLiquido * 0.15;

        System.out.println("O valor doimposto de renda é: "+ impostoRenda);

        teclado.close();
    }
}