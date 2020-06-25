/* Intput: Hora trabalhada do projeto; nome do trabalhador; função; quantidade de horas trabalhadas
Output: Quanto o trabalhador ira receber(horas trabalhadas * valor + premio por produtividade)
Meida de horas trabalhadas por pessoa
nome e função da pessoa que tem o maior salario */

import java.util.Scanner;

public class Ex08C11 {
    public static void main(String[] args) {
        
        int hora_trabalhada_projeto, hora_trabalhada_trabalhador, salario;
        String nome_trabalhador, funcao;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do trabalhador: ");
        nome_trabalhador = teclado.nextLine();

        while(!nome_trabalhador.equalsIgnoreCase("FIM"))
        {
            System.out.print("Digite a função do trabalhador: ");
            funcao = teclado.nextLine();
            System.out.print("");
        }
        
        teclado.close();

    }
}