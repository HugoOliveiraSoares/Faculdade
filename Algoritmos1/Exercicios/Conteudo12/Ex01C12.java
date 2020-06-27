import java.util.Scanner;

public class Ex01C12 {

    public static void main(String[] args) {
        
        double ponto1_x, ponto1_y, ponto2_x, ponto2_y, distancia;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a coordenada x do ponto 1: ");
        ponto1_x = teclado.nextDouble();
        System.out.print("Digite a coordenada y do ponto 1: ");
        ponto1_y = teclado.nextDouble();
        System.out.print("Digite a coordenada x do ponto 2: ");
        ponto2_x = teclado.nextDouble();
        System.out.print("Digite a coordenada y do ponto 2: ");
        ponto2_y = teclado.nextDouble();

        distancia = distancia_pontos(ponto1_x, ponto1_y, ponto2_x, ponto2_y);

        System.out.println("Distância = "+ distancia);
        
        teclado.close();

    }

    static double distancia_pontos(double x1, double y1, double x2, double y2) {

        double dist;

        dist = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

        return dist;
        
    }

}