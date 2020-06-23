import java.util.Scanner;

public class Ex22C13 {
    public static void main(String[] args) {
        
        String placas_carro[] = new String[100];
        String dono_carro[] = new String[100];
        String pesquisa;
        int vaga = 0;

        Scanner teclado = new Scanner(System.in);
        
        for (int aux = 0; aux < 100; aux++)
        {
            System.out.print("Digite o seu nome: ");
            dono_carro[aux] = teclado.nextLine();
            System.out.print("Digite a placa do seu carro: ");
            placas_carro[aux] = teclado.nextLine();
        }               

        System.out.print("Digite a placa do carro ou o nome do dono: ");
        pesquisa = teclado.nextLine();

        for (int aux = 0; aux < 100; aux++) 
        {
            if(pesquisa.compareToIgnoreCase(dono_carro[aux]) == 0 || pesquisa.compareToIgnoreCase(placas_carro[aux]) == 0)
                vaga = aux+1;
        }

        if(vaga != 0)
                System.out.println("O numero da vaga é: "+(vaga));
            else
                System.out.println("Carro não encontrado!");

        teclado.close();

    }
}