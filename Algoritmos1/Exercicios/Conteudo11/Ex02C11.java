import java.util.Scanner;

public class Ex02C11 {
    public static void main(String[] args) {
        
        String nome, nome_menor_aplicacao = "";
        double valor_aplicado, media_bronze, somatorio_valor_bronze = 0, valor_total = 0, valor_aplicado_menor = 0;
        int cont_bronze = 0, cont_prata = 0, cont_ouro = 0, cont_clientes = 1;

        Scanner teclado = new Scanner(System.in);
        
        while (cont_clientes <= 538)
        {
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite o valor que você aplicou: ");
            valor_aplicado = teclado.nextDouble();
            teclado.nextLine();


            System.out.println("\nCliente: "+ nome+"\n Valor aplicado: "+valor_aplicado);

            if (valor_aplicado <= 1000)
            {
                System.out.println("Classificação: Bronze");
                cont_bronze++;
                somatorio_valor_bronze += valor_aplicado;
                
            } else if (valor_aplicado <= 5000)
            {
                System.out.println("Classificação: Prata");
                cont_prata++;

            }else if (valor_aplicado > 5000)
            {
                System.out.println("Classificação: Ouro");
                cont_ouro++;
            }

            if (cont_clientes == 1 || valor_aplicado < valor_aplicado_menor)
            {
                valor_aplicado_menor = valor_aplicado;
                nome_menor_aplicacao = nome;
            }

            valor_total += valor_aplicado;
            cont_clientes++;
        }

        media_bronze = somatorio_valor_bronze / cont_bronze;

        System.out.println("Total de Bronze = "+cont_bronze);
        System.out.println("Total de Prata = "+cont_prata);
        System.out.println("Total de Ouro = "+cont_ouro);

        System.out.println("Média das aplicações dos clientes bronze = "+media_bronze);
        System.out.println("Volume total das aplicações: "+valor_total);
        System.out.println("Nome do aplicador de menor aplicação: "+nome_menor_aplicacao);

        
        teclado.close();

    }
}