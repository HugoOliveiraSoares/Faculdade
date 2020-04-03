import java.util.Scanner;

public class Ex11C5 {
    // Função: Le um número de um cheque e separa os códigos
    // Autor: Hugo Oliveira Soares
    
    public static void main(String[] args){

        int cheque, banco, agencia, sequencial;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número do cheque bancario: ");
        cheque = teclado.nextInt(); //999888777

        banco = cheque / 1000000;

        agencia = cheque / 1000 % 1000; 

        sequencial = cheque % 1000;

        System.out.println("Banco: "+ banco);
        System.out.println("Agencia: " + agencia);
        System.out.println("Sequencial: " + sequencial);
        
        teclado.close();
    }

}