import java.util.Scanner;

public class CalcIdade {

	public static void main(String[] args) {

		String nome;
		int anoNasc, anoAtual, idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite o seu ano de nascimento: ");
		anoNasc = teclado.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = teclado.nextInt();

		idade = anoAtual - anoNasc;
		System.out.println(nome+", voce tem/terá "+idade+" anos em "+anoAtual);
		teclado.close();

	}

}
