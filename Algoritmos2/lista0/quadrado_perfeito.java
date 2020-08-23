import java.util.Scanner;

public class quadrado_perfeito {
    public static void main(String[] args) {
        int numero, mImpares, quantImpares = 0, somaImpares = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        mImpares = (int) Math.sqrt(numero);

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0 && quantImpares < mImpares) {
                somaImpares += i;
                quantImpares++;
            }
        }

        if (somaImpares == numero) {
            System.out.println("É um quadrado perfeito");
        } else {
            System.out.print("Não é um quadrado perfeito");
        }
        
        teclado.close();
    }
}