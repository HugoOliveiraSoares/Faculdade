import java.util.Scanner;

public class Ex2C6 {
    // Função: Calcula a multa de uma empresa dependendo da quantidade de poluentes emitidos por ela 
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {
        
        double poluentes, multa = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de poluentes emitido por uma empresa: ");
        poluentes = teclado.nextDouble();

        if (poluentes <= 1500 ) 
        {
            System.out.println("Multa = 0" );

        }
        
        if (poluentes > 1500 && poluentes <= 3500) 
        {
            System.out.println("Multa = R$3000");
        
        }
        
        if (poluentes > 3500) {

            multa = 5000 * poluentes;
            System.out.printf("Multa = R$%.2f\n", multa);
            
        }

        teclado.close();
    }

}