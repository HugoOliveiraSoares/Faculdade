import java.util.Scanner;

public class Ex03C12 {
    public static void main(String[] args) {

        int numero, posicao;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número entre 0 e 999999999 para decompor: ");
        numero = teclado.nextInt();

        System.out.print("Digite a posição do número que deseja(em ordem inversa): ");
        posicao = teclado.nextInt();

        System.out.println("Retorno = " + decomposição(numero, posicao));
        
        teclado.close();
        
    }
    
    static int decomposição(int num, int pos)
    {
        int retorno, div = 1;

        div = (int) Math.pow(10, pos);

        retorno = num % div / (div / 10);

        return retorno;
    }
}