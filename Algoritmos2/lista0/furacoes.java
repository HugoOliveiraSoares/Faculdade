import java.util.Scanner;

public class furacoes {
    public static void main(String[] args) {
        
        int velocidadeVentos;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a velocidade dos ventos(km/h): ");
        velocidadeVentos = teclado.nextInt();

        if (velocidadeVentos <= 61){
            System.out.println("Não é uma tempestade.");
        } else if (velocidadeVentos <= 118) {
            System.out.println("Tempestade tropical");
        }else if (velocidadeVentos <= 153) {
            System.out.println("Furacão categoria 1");
        } else if (velocidadeVentos <= 177) {
            System.out.println("Furacão categoria 2");
        }else if (velocidadeVentos <= 209) {
            System.out.println("Furacão categoria 3");
        }else if (velocidadeVentos <= 249) {
            System.out.println("Furacão categoria 4");
        }else{
            System.out.println("Furacão categoria 5");
        }
        
        teclado.close();
    }
}