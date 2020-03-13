import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        double salariofixo = 240;
        double comissao, vendas, salario; 
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor mensal das vendas: ");
        vendas = teclado.nextDouble();

        if (vendas <= 1000) {

            System.out.println("Salario = R$240,00");    
        }

        if (vendas >= 1000 && vendas <= 10000) {
            
            comissao = 0.1 * vendas;
            salario = salariofixo + comissao;
            System.out.printf("Salario = R$%.2f\n", salario);
        }

        if (vendas > 10000) {
            
            comissao = 1000;
            salario = salariofixo + comissao;
            System.out.printf("Salario = R$%.2f\n", salario);
        }
        
        teclado.close();     
    }
}