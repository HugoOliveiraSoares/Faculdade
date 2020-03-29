import java.util.Scanner;

public class Exercicio4
{
    // Função: Indica a situação corporal da pessoa de acordo com o IMC
    // Autor: Hugo Oliveira Soares
    
	public static void main(String[] args){
       
       double altura, peso, imc; // m, kg
       String nome;
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.print("Digite o seu nome: ");
        nome  = teclado.nextLine();

       System.out.print("Digite a sua altura em metros: ");
       altura = teclado.nextDouble();

       System.out.print("Digite o seu peso em kg: ");
       peso = teclado.nextDouble();

       imc = peso / Math.pow(altura, 2);

       System.out.print("A situação corporal de " + nome + " é : ");
       
       if (imc < 18) 
       {
            System.out.println("desnutrido.");
       
        } else if (imc >= 18 && imc < 20) 
        {
            System.out.println("abaixo do peso.");
        }else if(imc >= 20 && imc <= 25 )
        {
            System.out.println("peso ideal.");
        }else if (imc > 25 && imc < 27) 
        {
            System.out.println("acima do peso.");
        }else
        {
            System.out.println("obeso.");
        }
       
       teclado.close();
       
	}
}
