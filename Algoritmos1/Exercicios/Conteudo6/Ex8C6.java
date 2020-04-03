import java.util.Scanner;

public class Ex8C6 {
    // Função: imprime os pesos mínimo e máximo de uma pessoa para que esteja dentro da faixa de peso ideal de acordo com o IMC
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) {

        double altura, pesomin, pesomax = 0; // m, kg
        String nome;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite a sua altura em metros: ");
        altura = teclado.nextDouble();

        pesomin = 20 * Math.pow(altura, 2);
        pesomax = 25 * Math.pow(altura, 2);

        System.out.println("A faixa de pesos de: " + nome);
        System.out.printf("Peso Minimo = %.2f Peso Maximo = %.2f \n", pesomin, pesomax);


        teclado.close();
        
    }
}