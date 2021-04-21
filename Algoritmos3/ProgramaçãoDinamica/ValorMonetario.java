import java.util.Scanner;

public class ValorMonetario {


    static String calculaTroco(double valor){
        
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.5};
        double[] troco = new double[moedas.length];

        int i = 0;

        while (valor > 0 && i < 5) {

            if (valor >= moedas[i]) {
                valor = valor - moedas[i];
                troco[i] = moedas[i];
            } else{
                i++;
            }

        }

        String trocado = "";
        for (double d : troco) {
            if (d != 0) {
                trocado += d + " ";   
            }
        }

        return trocado;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        System.out.println(calculaTroco(valor));

        scanner.close();

    }
}
