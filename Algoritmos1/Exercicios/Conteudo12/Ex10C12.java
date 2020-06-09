import java.util.Scanner;

public class Ex10C12 {
    public static void main(String[] args) {
        
        String nome, letras;
        int tamanho;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();
        tamanho = nome.length();

        for (int x = 0; x < tamanho; x++)
        {
            letras = nome.substring(x, x+1);

            System.out.println(letras.toUpperCase());
        }
        
        teclado.close();

    }
}