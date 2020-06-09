import java.util.Scanner;

public class Ex06C12 {
    public static void main(String[] args) {
        
        String nome_familia, nome;
        int tamanho_nome, tamanho_nome_familia;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome da sua familia: ");
        nome_familia = teclado.nextLine();
        tamanho_nome_familia = nome_familia.length();

        for (int x = 1; x <= 100; x++)
        {
            System.out.print("Digite um nome completo: ");
            nome = teclado.nextLine();
            tamanho_nome  = nome.length();

            if (nome.substring((tamanho_nome - tamanho_nome_familia), tamanho_nome).equalsIgnoreCase(nome_familia))
            {
                System.out.println("Pertence a familia.");
                
            } else
            {
                System.out.println("Não pertence a familia.");
            }
        }
        
        teclado.close();

    }
}