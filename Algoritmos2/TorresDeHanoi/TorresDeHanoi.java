import java.util.Scanner;

public class TorresDeHanoi {

    // Método que realiza (imprime) o movimento
    // de um disco entre dois pinos
    private static void mover(int O, int D) {
        System.out.println(O + " -> " + D);
    }

    // Método que implementa a recursão
    // O = pino origem
    // D = pino destino
    // T = pino de trabalho
    static void hanoi(int n, int O, int D, int T) {

        if (n > 0) {
            hanoi(n - 1, O, T, D);
            mover(O, D);
            hanoi(n - 1, T, D, O);
        }

    }

    // executando o hanoi
    public static void main(String[] args) {

        int n; // número de discos

        // recebe o número de discos digitado pelo usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        n = entrada.nextInt();

        // executa o hanoi!
        TorresDeHanoi.hanoi(n, 1, 3, 2);

        entrada.close();
    }
}