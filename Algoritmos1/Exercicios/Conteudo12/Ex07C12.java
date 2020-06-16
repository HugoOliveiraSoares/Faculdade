import java.util.Scanner;

public class Ex07C12 {
    public static void main(String[] args) {
        
        String nome;
        String[] sobrenome;
        int tam_array;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu nome completo: ");
        nome = teclado.nextLine();

        sobrenome = nome.split(" "); // .split() retorna um array usando uma regra se separação

        tam_array = sobrenome.length;

        System.out.println(sobrenome[tam_array - 1]); 

        teclado.close();

    }
}
