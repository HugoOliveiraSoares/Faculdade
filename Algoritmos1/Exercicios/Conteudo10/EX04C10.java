import java.util.Scanner;

/*
* Autor: Hugo Oliveira Soares
*/
public class EX04C10 {
    public static void main(String[] args) {

        double bdi, preco_uni, preco_final, quant_produ, custo_parc, custo_total = 0;
        String nome = "";

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a taxa de BDI da empresa: ");
        bdi = teclado.nextDouble();
        teclado.nextLine();

        do 
        {
            System.out.print("Digite o nome do produto: ");
            nome = teclado.nextLine();

            if (nome.compareToIgnoreCase("FIM") != 0) 
            {
                System.out.print("Digite a quantidade do produto: ");
                quant_produ = teclado.nextDouble();
                System.out.print("Digite o preço unitario: ");
                preco_uni = teclado.nextDouble();
                teclado.nextLine();
                custo_parc = quant_produ * preco_uni;
                custo_total += custo_parc;
                System.out.println("Preço parcial: "+custo_parc);
            }

            
        } while (nome.compareToIgnoreCase("FIM") != 0);

        bdi = custo_total * (bdi / 100.0);
        preco_final = custo_total + bdi;

        System.out.println("Custo total = " + custo_total);
        System.out.println("BDI = " + bdi);
        System.out.println("Preço final = "+preco_final);
        
        teclado.close();

    }
}