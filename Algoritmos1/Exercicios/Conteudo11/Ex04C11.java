import java.util.Scanner;

public class Ex04C11 {

    public static void main(String[] args) {
        
        int quant_multas = 1, idade, idade_maior = 0, soma_idade = 0, quant_pontos, cont_mulher_com7pontos = 0, cont_homens = 0;
        double valor_multa, media_idade, valor_multa_total = 0, percent_homens;
        String nome, nome_maisVelho = "", sexo_condutor;

        Scanner teclado = new Scanner(System.in);
        
        while (quant_multas <= 3) 
        {
            System.out.print("Digite o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite a sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Digite o seu sexo: ");
            sexo_condutor = teclado.nextLine();
            System.out.print("Digite a quantidade de pontos que perdeu na carteira: ");
            quant_pontos = teclado.nextInt();
            System.out.print("Digite o valor da multa: ");
            valor_multa = teclado.nextDouble();
            teclado.nextLine();

            soma_idade += idade;
            valor_multa_total += valor_multa;
            
            if (sexo_condutor.equalsIgnoreCase("M"))
                cont_homens++;
            else if (quant_pontos == 7)
                cont_mulher_com7pontos++;
            
            if (idade > idade_maior)
            {
                idade_maior = idade;
                nome_maisVelho = nome;
            }

            quant_multas++;
            
        }

        percent_homens = (float) (cont_homens * 100) / (quant_multas - 1);
        media_idade = (float) soma_idade / (quant_multas - 1);

        System.out.println("A media das idades é de: "+ media_idade);
        System.out.printf("O valor total das multas é de R$%.2f\n",valor_multa_total);
        System.out.println("O percentual de homens multados é de: "+ percent_homens);
        System.out.println("A quantidade de mulheres que perderam 7 pontos é de: "+ cont_mulher_com7pontos);
        System.out.println("A pessoa de nome "+nome_maisVelho+" é a pessoa mais velha com "+idade_maior+ " anos.");
        
        teclado.close();
        
        
    }
}