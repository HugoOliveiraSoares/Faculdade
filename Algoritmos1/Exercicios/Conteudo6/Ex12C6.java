import java.util.Scanner;

public class Ex12C6 {
    // Função: Calcula o custo total de embalagem e estocagem das boloas da copa
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        int quantBolas, quantBolas_Total, quantBolas_defeito, quantCaixa, quantGalpoes,quantMeses;
        double precoUnitCaixa, aluguelMesal, custoTotal;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de bolas produzidas pela fabrica: ");
        quantBolas_Total = teclado.nextInt();

        System.out.print("Digite a quantidade de bolas defeituosas e que seram descartadas: ");
        quantBolas_defeito = teclado.nextInt();

        System.out.print("Digite o preço unitario das caixas de papelão: ");
        precoUnitCaixa = teclado.nextDouble();

        System.out.print("Digite quantos meses faltam para a Copa do Mundo: ");
        quantMeses = teclado.nextInt();

        System.out.print("Digite o valor mensal do alugel dos galpões: ");
        aluguelMesal = teclado.nextDouble();

        quantBolas = quantBolas_Total - quantBolas_defeito;

        if (quantBolas % 10 != 0) 
        {
            quantCaixa = quantBolas / 10 + 1;

        } else 
        {    
            quantCaixa = quantBolas / 10;
        
        }

        if (quantCaixa % 850 != 0) 
        {
            quantGalpoes = quantCaixa / 850 + 1;
            
        } else 
        {
            quantGalpoes = quantCaixa / 850;

        }

        custoTotal = (quantMeses * aluguelMesal *quantGalpoes) + (quantCaixa * precoUnitCaixa);

        System.out.println("O custo total de embalagem mais estocagem é de: " + custoTotal);


        teclado.close();

    }
}