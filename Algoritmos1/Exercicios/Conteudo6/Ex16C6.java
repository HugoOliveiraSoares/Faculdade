import java.util.Scanner;

public class Ex16C6 {
    // Função: Calcula o resultado final dos alunos usando o número de faltas, as 3 provas, nota no trabalho e a idade do aluno. 
    // Autor: Hugo Oliveira Soares

    public static void main(String[] args) 
    {
        double notaFinal, mediaProvas, notaTrabalho, notaP1, notaP2, notaP3;
        int idade, faltas, peso1, peso2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de faltas: ");
        faltas = teclado.nextInt();

        System.out.print("Digite a nota da prova1: ");
        notaP1 = teclado.nextDouble();
        
        System.out.print("Digite a nota da prova2: ");
        notaP2 = teclado.nextDouble();
        
        System.out.print("Digite a nota da prova3: ");
        notaP3 = teclado.nextDouble();
        
        System.out.print("Digite a nota do trabalho: ");
        notaTrabalho = teclado.nextDouble();
        
        System.out.print("Digite a idade do aluno: ");
        idade = teclado.nextInt();

        /* -------------------------REVISAR------------------------- */
        if( (notaP1 >= notaP2 && notaP1 > notaP3) && (notaP2 > notaP3) )
        {
            mediaProvas = (notaP1 + notaP2) /2;
            
        } else if( (notaP1 >= notaP2 && notaP1 > notaP3) && (notaP3 > notaP2) )
        {
            mediaProvas = (notaP1 + notaP3) / 2;

        } else if ( (notaP2 >= notaP1 && notaP2 > notaP3) && (notaP1 > notaP3) )
        {
            mediaProvas = (notaP2 + notaP1) / 2;
            
        } else if ((notaP2 >= notaP1 && notaP2 > notaP3) && (notaP3 > notaP1))
        {
            mediaProvas = (notaP2 + notaP3) / 2;

        }else if ((notaP3 >= notaP1 && notaP3 >notaP2) && (notaP1 > notaP2) ) 
        {
            mediaProvas = (notaP3 + notaP1) / 2;
            
        }else if ((notaP3 >= notaP1 && notaP3 > notaP2) && (notaP2 > notaP1)) 
        {
            mediaProvas = (notaP3 + notaP2) / 2;
            
        }else 
            mediaProvas = (notaP1 + notaP2) / 2;

        if (faltas <= 5) 
        {
            peso1 = 3;

        } else if(faltas > 5 && faltas <= 10)
        {
            peso1 = 2;

        }else 
            peso1 = 1;

        
        if (idade <= 17) 
        {
            peso2 = 1;
            
        } else if(idade >= 18 && idade <= 50)
        {
            peso2 = 2;
        }else
            peso2 = 3;
        
        notaFinal = mediaProvas * peso1 + notaTrabalho * peso2;
        // System.out.println(notaFinal);

        if (notaFinal <= 50) 
        {
            System.out.println("Reprovado");
            
        } else if(notaFinal > 50 && notaFinal <= 70)
        {
            System.out.println("Regular");
        
        }else if (notaFinal > 70 && notaFinal <= 80) 
        {
            System.out.println("Bom");
            
        }else if (notaFinal > 80 && notaFinal <= 90) 
        {
            System.out.println("Muito bom");

        }else
            System.out.println("Exelente");

        teclado.close();
    }

    
}