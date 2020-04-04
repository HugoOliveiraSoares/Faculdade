/*
* Função: Digite a função do codigo 
* Autor: Hugo Oliveira Soares
* Data: 03/04/2020
*/

import java.util.Scanner;

public class E01381B {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int data, dia, mes, ano;
        String Mes;

        System.out.print("Digite uma data no formato DDMMAA(dia,mes,ano): ");
        data = teclado.nextInt();

        dia = data / 10000;
        mes = data / 100 % 100;
        ano = data % 100;

        if (mes == 1) 
        {
            Mes = "Janeiro";
            
        } else if(mes == 2)
        {
            Mes = "Fevereiro";

        }else if (mes == 3) 
        {
            Mes = "Março";
            
        } else if(mes == 4)
        {
            Mes = "Abril";

        }else if (mes == 5) 
        {
            Mes = "Maio";

        } else if (mes == 6) 
        {
            Mes = "Junho";

        } else if (mes == 7) 
        {
            Mes = "Julho";

        } else if (mes == 8) 
        {
            Mes = "Agosto";

        } else if (mes == 9) 
        {
            Mes = "Setembro";

        }else if (mes == 10) 
        {
            Mes = "Outubro";

        } else if (mes == 11) 
        {
            Mes = "Novembro";
        }else
            Mes = "Dezembro";

        System.out.println(dia+" de "+Mes+" de "+(ano+2000));
        
        teclado.close();

    }

}