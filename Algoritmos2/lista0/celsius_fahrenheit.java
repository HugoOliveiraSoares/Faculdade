import java.util.Scanner;

public class celsius_fahrenheit {
   public static void main(String[] args) {
       double celsius, fahrenheit;
       int opcao;

       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite uma opção: ");
       System.out.println("1) Celsius para Fahrenheit");
       System.out.println("2) Fahrenheit para Celsius");
       opcao = teclado.nextInt();
       if (opcao == 1) {
           System.out.print("Digite uma temperatura em celsius: ");
           celsius = teclado.nextDouble();
           fahrenheit = (celsius * (9.0 / 5.0)) + 32;
           System.out.println(celsius+"C° em Fahrenheit "+fahrenheit);
       }else{
           System.out.print("Digite uma temperatura em Fahrenheit: ");
           fahrenheit = teclado.nextDouble();
           celsius = (fahrenheit - 32) * (5.0/9.0);
           System.out.println(fahrenheit+"F° em Celsius "+celsius);
       }
       
       teclado.close();
    }
}