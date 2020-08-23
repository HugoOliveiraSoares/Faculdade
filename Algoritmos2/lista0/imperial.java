import java.util.Scanner;

public class imperial {
    public static void main(String[] args) {
        
        double medida;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma medida: ");
        medida = teclado.nextDouble();

        milhaParaMetro(medida);
        jardasParaMetro(medida);
        pesParaMetro(medida);
        polegadaParaMetro(medida);

        teclado.close();
    }
    
    public static void milhaParaMetro(double medida) {
        double metro = medida * 1609.34;
        System.out.println(medida + " milhas são " + metro + " metros");
    }

    public static void jardasParaMetro(double medida) {
        double metro = medida * 0.91;
        System.out.println(medida + " jardas são " + metro + " metros");
    }

    public static void pesParaMetro(double medida) {
        double metro = medida * 0.3;
        System.out.println(medida + " pes são " + metro + " metros");
    }

    public static void polegadaParaMetro(double medida) {
        double metro = (medida * 2.54) / 100;
        System.out.println(medida+" polegadas são "+metro+" metros");
    }
}