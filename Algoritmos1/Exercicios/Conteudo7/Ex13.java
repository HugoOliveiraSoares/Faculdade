import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        String nomeCidade, nomeCidadeMenor = "";
        int populacao, quantEleitores, quantMulheres, quantHomens, quantCidadesacimamilhao = 0, quantCidademaisMulheres = 0, menorPopulacao = 0;
        double percentEleitores;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 5; aux++)
        {
            System.out.println("\n\t===================Pesquisa sobre as cidades de MG===================\n");
            System.out.print("Digite o nome da cidade: ");
            nomeCidade = teclado.nextLine();
            System.out.print("Digite a população desta cidade: ");
            populacao = teclado.nextInt();
            System.out.print("Digite a quantidade de eleitores desta cidade: ");
            quantEleitores = teclado.nextInt();
            System.out.print("Digite a quantidade de homens na cidade: ");
            quantHomens = teclado.nextInt();
            System.out.print("Digite a quantidade de mulheres na cidade: ");
            quantMulheres = teclado.nextInt();
            teclado.nextLine();

            System.out.println("\n\t\t-------------Dados da cidade "+nomeCidade+"-------------\n");
            
            if (quantHomens + quantMulheres != populacao) 
                System.out.println("A soma de homens e mulheres difere da população.");
            else
                System.out.println("A soma de homens e mulheres não difere da população.");

            percentEleitores = quantEleitores * 100 / populacao;
            System.out.printf("A porcentagem de eleitores é de %.2f %%\n",percentEleitores);

            if (populacao > 1000000) 
                quantCidadesacimamilhao++;

            if (quantMulheres > quantHomens)
                quantCidademaisMulheres++;

            if (aux == 1 || populacao < menorPopulacao)
            {
                menorPopulacao = populacao;
                nomeCidadeMenor = nomeCidade;
            }
        }
        
        System.out.println("\n\t===================Informações gerais===================\n");

        System.out.println("Total de cidades com mais de 1 milhão de habitantes = "+ quantCidadesacimamilhao);
        System.out.println("Cidades com mais mulheres que homens = "+ quantCidademaisMulheres);
        System.out.println("Cidade com menor população = "+ nomeCidadeMenor);

        teclado.close();

    }

}