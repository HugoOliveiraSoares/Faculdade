// import java.util.Random;
import java.util.Scanner;

/**
 * Ex05a 
 * */
public class Ex05aC8 {

    public static void main(String[] args) {
        
        int candidato1T1 = 0, candidato2T1 = 0, candidato3T1 = 0, candidato1T2 = 0, candidato2T2 = 0,
            candidato3T2 = 0, voto = 0, votonulo = 0, votosvalidos = 0;
        Scanner teclado = new Scanner(System.in);
        // Random gerador = new Random();

        for (int x = 1; x <= 100; x++) {
           System.out.print("1-Fulano 2-Ciclano 3-Beltrano \n Digite o seu voto: ");
           voto = teclado.nextInt();
           //voto = gerador.nextInt(3) + 1;
           System.out.println(voto);

           if (voto == 1) {
              candidato1T1++;

           } else if (voto == 2) {
              candidato2T1++;

           } else if (voto == 3) {
              candidato3T1++;
           } else {
              System.out.println("Opção invalida");
           }
        }
        votosvalidos = candidato1T1 + candidato2T1 + candidato3T1;
        
        System.out.println("####################### Resultado do primeiro turno #######################");
        System.out.println("Candidato Fulano: " + candidato1T1);
        System.out.println("Candidato Ciclano: " + candidato2T1);
        System.out.println("Candidato Beltrano:" + candidato3T1);
        System.out.println("Votos nulos: " + votonulo);

        if (candidato1T1 > candidato2T1 && candidato1T1 > candidato3T1) 
            System.out.println("Candidato Fulano eleito.");
         else if (candidato2T1 > candidato1T1 && candidato2T1 > candidato3T1) 
            System.out.println("Candidato Ciclano eleito.");
         else if (candidato3T1 > candidato1T1 && candidato3T1 > candidato2T1) 
            System.out.println("Candidato Beltrano eleito.");
         else if (votosvalidos < votonulo) 
            System.out.println("Eleições anuladas, mais votos nulos do que validos.");    
         else {
            System.out.println("Houve empate! Havera segundo turno!");
            for (int x = 1; x <= 100; x++) 
            {
               System.out.print("1-Fulano 2-Ciclano 3-Beltrano \n Digite o seu voto: ");
               voto = teclado.nextInt();
               // voto = gerador.nextInt(3) + 1;
               System.out.println(voto);
               if (candidato1T1 == candidato2T1) 
               {
                  
               }

               if (voto == 1) {
                  candidato1T1++;
               } else if (voto == 2) {
                  candidato2T1++;
               } else if (voto == 3) {
                  candidato3T1++;
               } else {
                  System.out.println("Opção invalida");
               }
            }     
            
         }


        teclado.close();
    }
}