import java.util.Scanner;

public class Ex20C8 {

    public static void main(String[] args) {
        
        double altura, imc;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a sua altura em metros: ");
        altura = teclado.nextDouble();

        System.out.println("Peso \t| IMC \t|  Situação Corpórea");
        System.out.println("--------------------------------------");

        for (int peso = 60; peso <= 100; peso++)
        {
            imc = peso / Math.pow(altura, 2);

            if (peso < 20) 
                System.out.printf("%d \t| %.3f | Abaixo do peso\n",peso,imc);
            else if (peso >= 20 && peso <= 25)
                System.out.printf("%d \t| %.3f | Peso Ideal\n",peso,imc);
            else if (peso > 25)
                System.out.printf("%d \t| %.3f | Acima do peso\n",peso,imc);

            System.out.println("--------------------------------------");
        }      
        
        teclado.close();

    }

}