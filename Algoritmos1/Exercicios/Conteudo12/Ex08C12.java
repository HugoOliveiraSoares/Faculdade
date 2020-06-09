import java.util.Scanner;

public class Ex08C12 {
    public static void main(String[] args) {
        
        String nome, inicial, inicial2, sobrenome;
        String[] nome_abnt;
        int tam;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();

        nome_abnt = nome.split(" ");
        tam = nome_abnt.length;

        sobrenome = nome_abnt[tam - 1];

        inicial = nome_abnt[0].substring(0,1);

        inicial2 = nome_abnt[1].substring(0,1);

        System.out.println(sobrenome.toUpperCase()+", "+inicial+". "+inicial2+". ");
        
        teclado.close();

    }
}