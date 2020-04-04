import java.util.Scanner;

public class Teste {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int codigo, diasPPP;
        double valorfixo, impostos, valorServicosExtras, valorPPP, conta;
        String cidade;

        System.out.println("informe o código");
        codigo = teclado.nextInt();

        System.out.println("valor dias pay-per-view");
        diasPPP = teclado.nextInt();

        System.out.println("informe o valor dos serviços extras");
        valorServicosExtras = teclado.nextDouble();

        System.out.println("informe a cidade");
        impostosCidades = teclado.nextDouble();

        if (cidade.equalsIgnoreCase("Belo Horizonte")) {
            imposto = valorfixo * 0;

        } else if (cidade.equalsIgnoreCase("Sao Paulo")) {
            imposto = valorfixo * 0.01 + diariasPPP * 0.01 + valorServicoExtras * 0.01;
        } else if (cidade.equalsIgnoreCase("Rio de Janeiro"))

            imposto = valorfixo * 0.015 + diariasPPP * 0.015 + valorServicoExtras * 0.015;
    }else if(cidade.equalsIgnoreCase("demais cidades"))

    imposto=valorfixo*0.02+diariasPPP*0.02+valorServicoExtras*0.02;

    if(código==1){valorfixo == 65.00}
    {
        double taxaPPP = 1.20;

        valorPPP = diasPPP * 1.20; // limitado à $65.00
        conta = valorfixo + valorPPP + imposto;

    }else if(codigo==2){valorfixo == 104.00}
    {
        double taxaPPP = 2.10;

        valorPPP = diasPPP * 2.10;
        conta = valorfixo + valorPPP + Imposto;
    }else if(codigo==3)
    {valorfixo == 137.00}
    {
        double taxaPPP = 0;

        valorPPP = diasPPP * 0;
        conta = valorfixo + valorPPP + imposto;
    }

    System.out.println(" O valor da conta é R$ "+conta);

}

}