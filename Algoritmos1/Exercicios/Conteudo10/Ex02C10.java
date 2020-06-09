import java.util.Scanner;

/*
* Autor: Hugo Oliveira Soares
*/
public class Ex02C10 {
    public static void main(String[] args) {
        
        double valor_projeto, valor_total = 0, media;
        int cont_geral = 0, cont_acima_mil = 0;

        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            System.out.print("Digite os valores recebidos dos projetos durante o mes, separadamente: ");
            valor_projeto = teclado.nextDouble();

            if (valor_projeto != 0)
            {
                valor_total += valor_projeto;
                cont_geral++;
                if (valor_projeto > 1000)
                    cont_acima_mil++;
            }
            System.out.println("Digite 0 para sair.");
            
        } while (valor_projeto != 0);

        media = valor_total / cont_geral;
        System.out.println("Valor total recebido = "+valor_total);
        System.out.println("Média dos valores recebidos = "+media);
        System.out.println("Quantidade de valores acima de R$1000.00 = "+cont_acima_mil);

        teclado.close();

    }
}