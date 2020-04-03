import java.util.Scanner;

public class Ex15C6 {
    // Função: Calcula a conta de um assinante de TV a cabo
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) 
    {
        double valorServicoExtra, valorFixo, conta, diariasPPP, imposto;
        int dias, codigo;
        String cidade;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o codigo do seu pacote de TV: ");
        codigo = teclado.nextInt();

        System.out.print("Digite a quantidade de dias em que usou o conteudo pay-per-view: ");
        dias = teclado.nextInt();

        System.out.print("Digite o valor dos serviços extras: ");
        valorServicoExtra = teclado.nextDouble();
        
        teclado.nextLine();
        System.out.print("Digite a cidade em mora: ");
        cidade = teclado.nextLine();

        if (codigo == 1) 
        {
            valorFixo = 65;
            diariasPPP = ((dias * 1.20) > 65) ? 65 : (dias * 1.20);

            
        } else if(codigo == 2) 
        {
            valorFixo = 104;
            diariasPPP = dias * 2.10;
            
        }else
        {
            valorFixo = 137;
            diariasPPP = dias * 0; 
        }

        if (cidade.equalsIgnoreCase("Belo Horizonte")) 
        {
            imposto = valorFixo * 0; // ISENTO
            
        } else if(cidade.equalsIgnoreCase("Sao Paulo"))
        {
            imposto = valorFixo * 0.01 + diariasPPP * 0.01 + valorServicoExtra * 0.01;

        }else if (cidade.equalsIgnoreCase("Rio de Janeiro")) 
        {
            imposto = valorFixo * 0.015 + diariasPPP * 0.015 + valorServicoExtra * 0.015;
            
        } else 
        {
            imposto = valorFixo * 0.02 + diariasPPP * 0.02 + valorServicoExtra * 0.02;
            
        }

        conta = valorFixo + diariasPPP + valorServicoExtra + imposto;
        System.out.printf("O preço da sua conta é de: %.2f\n", conta);
        
        
        teclado.close();

    }
    
}