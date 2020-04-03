import java.util.Scanner;

public class Ex9C6 {
    // Função: Calcula o peso ideal da pessoa de acordo com a altura e sexo
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {

        double pesoIdeal, altura = 0;
        String sexo;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros: ");
        altura = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Digite o seu sexo. F para feminino e M para masculino: ");
        sexo = teclado.nextLine();

        if (sexo.equalsIgnoreCase("M")) 
        {
            pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Seu peso ideal é: %.3f\n", pesoIdeal);

        } else if(sexo.equalsIgnoreCase("F")) 
        {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Seu peso ideal é: %.3f\n", pesoIdeal);

        }
        
        teclado.close();

    }
}