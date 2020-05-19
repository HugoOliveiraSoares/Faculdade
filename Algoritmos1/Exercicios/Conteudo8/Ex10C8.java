/*
*
* Função: Le o nome de um projeto, o preço unitario e a quantidade consumida de cada insumo e 
* calcula o custo total do projeto, a media dos custos parciais e o insumo de custo maior
* Autor: Hugo Oliveira Soares
*
*/

import java.util.Scanner;

public class Ex10C8 {

    public static void main(String[] args) {

        int quantDIsumo, quantIsumoConsumida;
        double precoUnit, custoTotal = 0, custoParc = 0, mediaCustoParc = 0, custoPMaior = 0;
        String nomeInsumo, nomeInsumoMaior = "";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de insumos: ");
        quantDIsumo = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= quantDIsumo; aux++)
        {
            System.out.print("Digite o nome do insumo: ");
            nomeInsumo = teclado.nextLine();

            System.out.print("Digite a quantidade consumida deste insumo: ");
            quantIsumoConsumida = teclado.nextInt();

            System.out.print("Digite o preço unitario do insumo: ");
            precoUnit = teclado.nextDouble();
            teclado.nextLine();

            custoParc = quantIsumoConsumida * precoUnit;

            custoTotal += custoParc;

            if (aux == 1 || custoParc > custoPMaior) 
            {
                custoPMaior = custoParc;
                nomeInsumoMaior = nomeInsumo;        
            }
        }

        mediaCustoParc = (float) custoTotal / quantDIsumo;

        System.out.printf("O custo total do projeto é de: %.2f\n"+ custoTotal);
        System.out.printf("A média dos custos parciais é de: %.2f\n"+ mediaCustoParc);
        System.out.println("O nome do insumo de maior custo parcial: "+ nomeInsumoMaior);
        
        teclado.close();

    }

}