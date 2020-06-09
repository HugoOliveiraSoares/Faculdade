import java.util.Scanner;

public class Ex09C12 {
    public static void main(String[] args) {
        
        String texto, t;
        int tam;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        texto = teclado.nextLine();

        tam = texto.split(" ").length;

        for (int aux = 0; aux < tam; aux++)
        {
            t = texto.split(" ")[aux].substring(0,1).toUpperCase();
            System.out.print(t + texto.split(" ")[aux].substring(1)+" ");
        }

        System.out.println();

        teclado.close();

    }
}