import java.util.Scanner;

public class Permutacao {
    public static void main(String[] args) {
        
        int sequencia, sequencia1;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma sequencia: ");
        sequencia = teclado.nextInt();

        System.out.print("Digite outra sequencia: ");
        sequencia1 = teclado.nextInt();

        if (isPermutacao(sequencia, sequencia1)) {
            System.out.println("É permutação");
        }else{
            System.out.println("Não é permutação");
        }
        
        teclado.close();

    }

    public static int contadigitos(int sequencia, int digito) {
        int cont = 0, n = 0;

        for (int i = 0; i < 9; i++) {
            n = (int) (sequencia % Math.pow(10, i+1) / Math.pow(10, i)) ;
            if (n == digito) {
                cont++;
            }
        }
        return cont;
    }

    public static boolean isPermutacao(int sequencia, int sequencia1) {
        int n;
        boolean isPermutacao = false;

        for (int i = 1; i <= 9; i++) {
            n = (int) (sequencia % Math.pow(10, i + 1) / Math.pow(10, i));
            if (contadigitos(sequencia, n) != contadigitos(sequencia1, n)) {
                isPermutacao = false;
                break;
            } else {
                isPermutacao = true;
            }
        }
        return isPermutacao;
    }
}