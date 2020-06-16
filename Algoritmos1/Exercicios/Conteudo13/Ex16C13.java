import java.util.Scanner;

public class Ex16C13 {
    public static void main(String[] args) {
        
        int num_inteiro[] = new int[10];
        double num_real = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < num_inteiro.length; aux++) {
            System.out.print("Digite um número inteiro: ");
            num_inteiro[aux] = teclado.nextInt();
        }

        System.out.print("Digite um número real: ");
        num_real = teclado.nextDouble();

        System.out.print("Multiplicação dos números inteiros com o nùmero real: ");
        for (int aux = 0; aux < num_inteiro.length; aux++)
        {
            System.out.println(num_real * num_inteiro[aux]);  
        }

        teclado.close();
    }
}