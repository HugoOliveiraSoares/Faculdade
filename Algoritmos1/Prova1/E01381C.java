/*
* Função: Digite a função do codigo 
* Autor: Hugo Oliveira Soares
* Data: 04/04/2020
*/

import java.util.Scanner;

public class E01381C {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double custoProduto, valorISS, valorFinalProduto, valorParcelas, desconto, acrescimo;
        int opcaoPagamento, nParcelas = 0;
        String codigoCidade;

        System.out.print("Digite o custo do produto desejado: ");
        custoProduto = teclado.nextInt();

        System.out.print("Digite a opção de pagamento: ");
        opcaoPagamento = teclado.nextInt();

        teclado.nextLine();
        System.out.print("Digite o codigo da sua cidade: ");
        codigoCidade = teclado.nextLine();

        if (opcaoPagamento == 1) 
        {
            desconto = custoProduto * (10.0 / 100);
            acrescimo = 0;
            nParcelas = 1;
            
        } else if(opcaoPagamento == 2) 
        {
            desconto = custoProduto * (5.0 / 100);
            acrescimo = 0;
            nParcelas = 1;
            
        }else if (opcaoPagamento == 3) 
        {
            desconto = 0;
            acrescimo = 0;
            nParcelas = 2;
            
        } else if (opcaoPagamento == 4) 
        {
            acrescimo = custoProduto * (10.0 / 100);
            desconto = 0;
            nParcelas = 3;
            
        } else 
        {
            acrescimo = custoProduto * (20.0 / 100);
            desconto = 0;   
            nParcelas = 6;
        }

        if (codigoCidade.equalsIgnoreCase("B")) 
        {
            valorISS = 0;
            
        } else if(codigoCidade.equalsIgnoreCase("S"))
        {
            valorISS = custoProduto * (1.0 / 100);

        }else if (codigoCidade.equalsIgnoreCase("R")) 
        {
            valorISS = custoProduto * (1.5/100);
            
        }else
        {
            valorISS = custoProduto * (2.0 / 100);
        }

        valorFinalProduto = custoProduto + valorISS - desconto + acrescimo;
        valorParcelas = valorFinalProduto / nParcelas;

        System.out.println("Valor final = R$"+valorFinalProduto);
        System.out.println("Parcela = R$"+valorParcelas);

        teclado.close();
        
    }

}