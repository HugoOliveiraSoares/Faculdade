import java.util.Scanner;

public class Ex11C12 {
    public static void main(String[] args) {
        
        String nome, penultima_palavra;
        int tamanho;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu nome completo: ");
        nome = teclado.nextLine();

        tamanho = nome.split(" ").length;

        penultima_palavra = nome.split(" ")[tamanho - 2];  

        System.out.println( penultima_palavra.toUpperCase() );
        
        teclado.close();

    }
}