import java.util.Scanner;

public class Ex07C11 {
    public static void main(String[] args) {
        
        double temperatura, temperatura_somatorio = 0, temperatura_media, temperatura_maior = 0, temperatura_menor = 0;
        int quant_dias, quant_dias_maior_temp = 0;

        Scanner teclado = new Scanner(System.in);
        
        quant_dias = 1;
        while(quant_dias <= 121)
        {
            System.out.print("Digite a temperatura do "+quant_dias+"° dia: ");
            temperatura = teclado.nextDouble();

            if (quant_dias == 1 || temperatura < temperatura_menor)
                temperatura_menor = temperatura;

            if (quant_dias == 1 || temperatura > temperatura_maior)
            {
                temperatura_maior = temperatura;
                quant_dias_maior_temp++;
            }


            temperatura_somatorio += temperatura;

            quant_dias++;

        }

        temperatura_media = temperatura_somatorio / quant_dias;

        System.out.println("A menor temperatura registrada: "+temperatura_menor);
        System.out.println("A maior temperatura registrada: "+temperatura_maior);
        System.out.println("A média das temperaturas registradas: "+temperatura_media);
        System.out.println("A quantidade de dias que ocorreu a maior temperatura: "+quant_dias_maior_temp);

        
        teclado.close();


    }
}