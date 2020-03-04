import java.util.Scanner; 
public class Exercicio1
{
	public static void main(String[] args) {
      int idade;
      String nomeP, nomeM, sobrenome;
      
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digite o seu primeiro nome: ");
      nomeP = teclado.nextLine();
      
      System.out.print("Digite o seu segundo nome: ");
      nomeM = teclado.nextLine();
      
      System.out.print("Digite o seu sobrenome: ");
      sobrenome = teclado.nextLine();
      
      System.out.print("Digite a sua idade: ");
      idade = teclado.nextInt();
     
     System.out.println();
     System.out.println(sobrenome +", "+ nomeP +", " + nomeM);
     System.out.println("Idade:"+ idade);

     teclado.close();
      
   }
}



