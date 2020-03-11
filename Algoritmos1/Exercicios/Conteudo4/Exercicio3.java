import java.util.Scanner;

public class Exercicio3
{
	public static void main(String[] args) 
	{
	    int Quantpoluente, QuantpoluenteMax;
	    double multa, multaMaxima, multaEmit;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de poluente emitido: ");
		Quantpoluente = in.nextInt();
		System.out.print("Digite a quantidade de poluente maxima: ");
		QuantpoluenteMax = in.nextInt();
		System.out.print("Digite o preço da multa: ");
		multa = in.nextDouble();
		System.out.print("Digite o preço da multa maxima: ");
		multaMaxima = in.nextDouble();
		System.out.print("Digite a multa por poluente emitido: ");
		multaEmit = in.nextDouble();
		System.out.println();
		//System.out.flush();
		
		System.out.print("=====================================================================================\n" +
		                 "              Quantidade de Poluente Emitido x Valor da multa                       \n" +
		                 "-------------------------------------------------------------------------------------\n" +
		                 "  Até "  + Quantpoluente + " multa de R$" + multa + "\n" +
		                 "-------------------------------------------------------------------------------------\n" +
		                 "  Entre " + Quantpoluente + " e " + QuantpoluenteMax + " multa de R$" + multaMaxima + "\n" +
		                 "-------------------------------------------------------------------------------------\n" +
		                 "  Acima de " + QuantpoluenteMax + " multa de R$" + multaEmit + " por poluente Emitido\n" +
		                 "======================================================================================\n");
		
	}
}