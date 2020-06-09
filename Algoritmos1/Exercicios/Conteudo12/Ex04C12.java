import java.util.Random;
import java.util.Scanner;

public class Ex04C12 {
    public static void main(String[] args) {
        
        int numero_aleatorio, cont_tentativas = 0, numero_lido;
        Random gerar_num_aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        numero_aleatorio = gerar_num_aleatorio.nextInt(99) + 1;
        // System.out.println(numero_aleatorio);
        
        System.out.println("Digite um número: ");
        numero_lido = teclado.nextInt();
        
        while (numero_aleatorio != numero_lido)
        {
            if(numero_aleatorio < numero_lido)
            {
                System.out.println("O número digitado esta acima do sorteado"); 
                
            }else
            {
                System.out.println("O número digitado esta abaixo do sorteado"); 
                
            }
            cont_tentativas++;

            System.out.println("Digite um número: ");
            numero_lido = teclado.nextInt();
        }

        cont_tentativas++;
        System.out.println("Parabens você acertou o número sorteado!");

        System.out.println("Tentativas: "+cont_tentativas);

        teclado.close();


    }
}