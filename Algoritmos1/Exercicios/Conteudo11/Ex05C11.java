import java.util.Scanner;

public class Ex05C11 {
   public static void main(String[] args) {

      String nome;
      int codigo_lingua, quant_alunos = 0, quant_alunos_in = 0;
      double mensalidade_media_escola, mensalidade_somatorio = 0;

      Scanner teclado = new Scanner(System.in);

      System.out.print("Digite o seu nome: ");
      nome = teclado.nextLine();

      while (nome.compareToIgnoreCase("FIM") != 0)
      {
         System.out.print("Digite a sua opção de curso: \n"
                        +"1 - Inglês\n"
                        +"2 - Francês\n"
                        +"3 - Espanhol\n"
                        +">>> ");
         codigo_lingua = teclado.nextInt();
         teclado.nextLine();

         System.out.println("Aluno: "+ nome);

         if (codigo_lingua == 1)
         {
            System.out.println("O valor da mensalidade do curso de inglês é de R$100,00.");
            quant_alunos_in++;
            mensalidade_somatorio += 100;

         }else if (codigo_lingua == 2)
         {
            System.out.println("O valor da mensalidade do curso de francês é de R$150,00.");
            mensalidade_somatorio += 150;

         } else if(codigo_lingua == 3)
         {
            System.out.println("O valor da mensalidade do curso de espanhol é de R$120,00.");
            mensalidade_somatorio += 120;

         }else
            System.out.println("Opção de curso invalida.");

         quant_alunos++;
         
         System.out.print("Digite o seu nome: ");
         nome = teclado.nextLine();

      }

      mensalidade_media_escola = mensalidade_somatorio / quant_alunos;

      System.out.println("A quantidade de alunos matriculados nas turmas de inglês é de: "+ quant_alunos_in);
      System.out.println("A mensalidade media da escola é de R$"+mensalidade_media_escola);

      teclado.close();
       
   } 
}