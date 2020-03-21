import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        int quantBolas, quantBolas_Total, quantBolas_defeito, quantMeses;
        double precoUnitCaixa, aluguelMesal;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de bolas produzidas pela fabrica: ");
        quantBolas_Total = teclado.nextInt();

        System.out.print("Digite a quantidade de bolas defeituosas e que seram descartadas: ");
        quantBolas_defeito = teclado.nextInt();

        System.out.print("Digite o preço unitario das caixas de papelão: ");
        precoUnitCaixa = teclado.nextDouble();

        System.out.print("Digite quantos meses faltam para a Copa do Mundo: ");
        quantMeses = teclado.nextInt();

        System.out.print("Digite o valor mensal do alugel das caixas de pa: ");
        aluguelMesal = teclado.nextDouble();

        quantBolas = quantBolas_Total - quantBolas_defeito;



        teclado.close();

    }
}