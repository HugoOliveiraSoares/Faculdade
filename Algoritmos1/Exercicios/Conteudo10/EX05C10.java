/*
* Autor: Hugo Oliveira Soares
*/
import java.util.Scanner;
public class EX05C10 {
    public static void main(String[] args) {

        double altura, peso, media_altura_m, altura_somatorio_m = 0;
        String sexo, flag = "";
        int quant_f = 0, quant_m = 0, quant_pessoas = 0, quant_f_menor60 = 0;

        Scanner teclado = new Scanner(System.in);
        
        do
        {
            System.out.print("\nDigite a sua altura: ");
            altura = teclado.nextDouble();
            System.out.print("Digite o seu peso: ");
            peso = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Digite o seu sexo (M:Masculino, F:Feminino): ");
            sexo = teclado.nextLine();

            quant_pessoas++;
            if (sexo.equalsIgnoreCase("F"))
            {
                quant_f++;
                if (peso < 60)
                    quant_f_menor60++;

            }else{
                quant_m++;
                altura_somatorio_m += altura;
            }

            System.out.print("\nTecle ENTER para continuar ou digite X para sair ");
            flag = teclado.nextLine();
            
        } while (flag.compareToIgnoreCase("X") != 0);

        media_altura_m = altura_somatorio_m / quant_m;

        System.out.println("\nA quantidade de pessoas pesquisadas é de: "+quant_pessoas);
        System.out.println("A quantidade de mulheres é de: "+quant_f);
        System.out.printf("A altura média dos homens é de: %.3f",media_altura_m);
        System.out.println("Quantidade de mulheres com peso menor que 60: "+quant_f_menor60);
        
        teclado.close();
        
    }
}