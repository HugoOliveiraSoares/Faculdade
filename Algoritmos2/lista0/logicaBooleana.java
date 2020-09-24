import java.util.Scanner;

public class logicaBooleana {
    public static void main(String[] args) {
        
        boolean resultado = true, A, B;
        char operacao;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\t\n Lógica Booleana");
        System.out.println("A para AND");
        System.out.println("O para OR");
        System.out.println("X para XOR");
        System.out.println("N para NAND");
        System.out.print("Digite o valor da variavel A: ");
        A = teclado.nextBoolean();
        teclado.nextLine();
        System.out.print("Digite a operação: ");
        operacao = (char) teclado.nextByte();
        System.out.print("Digite o valor da variavel B: ");
        B = teclado.nextBoolean();

        if (operacao == 'A' || operacao == 'a') {
            resultado = A && B;
        }else if (operacao == 'O' || operacao == 'o') {
            resultado = A || B;
        }else if (operacao == 'X' || operacao == 'x') {
            resultado = !(A || B);
        }else if (operacao == 'N' || operacao == 'n') {
            resultado = !(A && B);
        }else{
            System.out.println("Operador invalido.");
        }

        System.out.println(resultado);

        teclado.close();
    }
}