import java.util.Scanner;

public class Ex10C6 {
    // Função: Calcula o valor a ser resgatado de um investimento
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double rendimento, capitalAplicado, impostoRenda, taxaDiaria, valorResgat;
        int num_dias;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o capital aplicado no investimento: ");
        capitalAplicado = teclado.nextDouble();

        System.out.print("Informe o número de dias em  que o capital ficou aplicado: ");
        num_dias = teclado.nextInt();

        System.out.print("Informe a taxa de juros diária: ");
        taxaDiaria = teclado.nextDouble();

        rendimento = capitalAplicado * (taxaDiaria / 100) * num_dias;
        impostoRenda = 0.15 * rendimento;
        valorResgat = capitalAplicado + rendimento - impostoRenda - 10;

        System.out.printf("O valor a ser resgatado é de: %.2f\n", valorResgat);

        teclado.close();

    }
}