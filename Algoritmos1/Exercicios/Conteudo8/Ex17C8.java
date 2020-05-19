import java.util.Scanner;

public class Ex17C8 {

    public static void main(String[] args) {
        
        int numero, result;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("============ Tabuada ============");
        System.out.print("Digite um número de 1 a 9: ");
        numero = teclado.nextInt();

        for (int aux = 1; aux <= 9; aux++)
        {
            result = numero * aux;
            System.out.println(aux+ " x "+ numero+ " = "+ result);
        }
        
        teclado.close();

    }

}