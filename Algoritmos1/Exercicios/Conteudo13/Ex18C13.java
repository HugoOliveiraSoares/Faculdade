import java.util.Scanner;
public class Ex18C13 {
    public static void main(String[] args) {
        
        String fila[] = new String[10];
        String nome;
        int posicao = -1;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < fila.length; aux++)
        {
            System.out.print("Digite o seu nome para entrar na fila: ");
            fila[aux] = teclado.nextLine();
        }

        System.out.print("Digite um nome para verificar se está na fila: ");
        nome = teclado.nextLine();

        for (int aux = 0; aux < fila.length; aux++)
        {
            if (fila[aux].compareToIgnoreCase(nome) == 0)
                 posicao = aux;
        }

        if (posicao != -1)
            System.out.println("A pessoa "+fila[posicao]+" está na posição "+(posicao+1));
        else
            System.out.println("A pessoa não se encontra na fila.");

        teclado.close();

    }
}