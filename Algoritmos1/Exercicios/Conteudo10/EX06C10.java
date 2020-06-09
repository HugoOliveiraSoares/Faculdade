
/*
* Autor: Hugo Oliveira Soares
*/
import java.util.Scanner;
public class EX06C10 {

    public static void main(String[] args) {
        
        double distancia, valor_A, valor_B, valor_C, p_x, p_y;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C de uma reta R");
        System.out.print("Digite A: ");
        valor_A = teclado.nextDouble();
        System.out.print("Digite B: ");
        valor_B = teclado.nextDouble();
        System.out.print("Digite C: ");
        valor_C = teclado.nextDouble();

        do
        {
            System.out.print("Digite a coordenada x de um ponto P: ");
            p_x =  teclado.nextDouble();
            System.out.print("Digite a coordenada y de um ponto P: ");
            p_y = teclado.nextDouble();

            distancia = (valor_A*p_x + valor_B*p_y + valor_C) / Math.sqrt(Math.pow(valor_A, 2)+ Math.pow(valor_B, 2));
            System.out.println("D = "+distancia);
            
        } while (distancia != 0);

        System.out.printf("O ponto que coincide com a reta R ( %.1fx %.1fy + %.1f ) é P = (%.1f, %.1f)\n",valor_A,valor_B,valor_C,p_x,p_y);
        
        teclado.close();
    }
}