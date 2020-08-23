import java.util.Scanner;

public class lacos {
    public static void main(String[] args) {
        
        int leituraN;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        leituraN = teclado.nextInt();

        System.out.println("Versão com for");        
        For(leituraN);
        System.out.println("\nVersão com while");
        While(leituraN);
        System.out.println("\nVersão com do-while");
        DoWhile(leituraN);
        System.out.println();
        
        teclado.close();

    }

    public static void For(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }

    public static void While(int n) {
        int i = 0;
        while (i < n) {
            System.out.print("* ");
            i++;
        }
    }

    public static void DoWhile(int n) {
        int i = 0;
        do {
            System.out.print("* ");
            i++;
        } while (i < n);
    }    
}