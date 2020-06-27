/* Autor: Hugo Oliveira Soares - E01381 */
import java.util.Scanner;

public class E01381A {
    public static void main(String[] args) {

        int tempo_uso_anos, tempo_uso_anos_Maior = 0, tipo_combustivel_codigo, cont_10anos_gasolina = 0, cont_5anos_uso = 0;
        double taxa_padrao, valor_vistoria = 0, media_ValorVistorias_ate5anos = 0, somatorio_valorVistorias = 0;
        String placa, placa_mais_tempo_uso = "";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da taxa padrão: ");
        taxa_padrao = teclado.nextDouble();
        teclado.nextLine();

        do {
            System.out.print("Digite a placa do carro no format0 ABC-123: ");
            placa = teclado.nextLine();
            System.out.print("Digite o tempo de uso do carro (em anos): ");
            tempo_uso_anos = teclado.nextInt();
            System.out.print("Digite o tipo de combustivel \n 1-Gasolina \n 2-Ácool \n 3-Outros \n >>> ");
            tipo_combustivel_codigo = teclado.nextInt();
            teclado.nextLine();

            if (tipo_combustivel_codigo == 1)
            {
                valor_vistoria = taxa_padrao * tempo_uso_anos;
                valor_vistoria -= valor_vistoria * 0.15;

                if (tempo_uso_anos > 10)
                    cont_10anos_gasolina++;

            } else if (tipo_combustivel_codigo == 2)
            {
                valor_vistoria = taxa_padrao * tempo_uso_anos;
                valor_vistoria -= valor_vistoria * 0.10;

            } else if (tipo_combustivel_codigo == 3)
                valor_vistoria = taxa_padrao * tempo_uso_anos;
            else
                System.out.println("Opção invalida");

            if (tempo_uso_anos <= 5)
            {
                somatorio_valorVistorias += valor_vistoria;
                cont_5anos_uso++;
            }

            if (tempo_uso_anos > tempo_uso_anos_Maior)
            {
                tempo_uso_anos_Maior = tempo_uso_anos;
                placa_mais_tempo_uso = placa;
            }

            System.out.println("Placa do Veículo: " + placa + "\n Valor da vistoria: " + valor_vistoria);

        } while (placa.compareToIgnoreCase("PWK-3361") != 0);

        media_ValorVistorias_ate5anos = somatorio_valorVistorias / cont_5anos_uso;

        System.out.println("A quantidade de veículos com mais de 10 anos de uso e que utilizam gasolina: " + cont_10anos_gasolina);
        System.out.println("A média dos valores de vistoria dos veículos com até 5 anos de uso: " + media_ValorVistorias_ate5anos);
        System.out.println("O veiculo com maior tempo de uso é: " + placa_mais_tempo_uso);

        teclado.close();

    }
}