import java.util.Scanner;

public class Ex03C11 {
    public static void main(String[] args) {
        
        String placa;
        int pontos, dia = 0;
        double multa, soma_multa = 0, cont_multas_pont8 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia em que ocorreu a infração: ");
        dia = teclado.nextInt();
        teclado.nextLine();
        
        while (dia != 99)
        {
            System.out.print("Digite a placa do carro do infrator: ");
            placa = teclado.nextLine();
            System.out.print("Digite a quantidade de pontos na carteira: ");
            pontos = teclado.nextInt();

            System.out.println("Placa: "+placa);
            
            if (pontos == 3)
            {
                System.out.println("A multa é de R$42,00");
                soma_multa += 42;

            } else if(pontos == 5)
            {
                System.out.println("A multa é de R$108,00");
                soma_multa += 108;

            }else if (pontos == 8 ) 
            {
                System.out.println("A multa é de R$479,00");
                soma_multa += 479;
                cont_multas_pont8++;
            
            }else
            {
                System.out.println("Opção invalida");
            }

            System.out.print("Digite o dia em que ocorreu a infração: ");
            dia = teclado.nextInt();
            teclado.nextLine();

        }
        
        System.out.println("Somatorio das multas: "+soma_multa);

        teclado.close();
        
    }
}