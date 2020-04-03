import java.util.Scanner;

public class Ex5C5 {
    // Função: Conversão de temperaturas
    // Autor: Hugo Oliveira Soares
    
    public static void main(String[] args) {

        double celcius, kelvin, fahrenheit;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Conversão de celcius para kelvin e fahrenheit");
        System.out.print("Digite uma temperatura em celcius: ");
        celcius = teclado.nextDouble();

        kelvin = celcius + 273;
        fahrenheit = (9*celcius + 160) / 5;

        System.out.printf("O valor de celcius para kelvin é: %.1f e fahrenheit é: %.1f\n", kelvin, fahrenheit);

        teclado.close();

        
    }
}