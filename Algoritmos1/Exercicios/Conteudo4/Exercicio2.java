import java.util.Scanner;
public class Exercicio2
{
    public static void main(String[] args) 
    {
        String nome, nomeEmpresa, cpf, identidade, tituloEleitor, carteiraMotorista;
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite o seu CPF: ");
        cpf = teclado.nextLine();
        System.out.print("Digite a sua Identidade: ");
        identidade = teclado.nextLine();
        System.out.print("Digite o seu Titulo de eleitor: ");
        tituloEleitor = teclado.nextLine();
        System.out.print("Digite a sua Carteira de Motorista: ");
        carteiraMotorista = teclado.nextLine();
        System.out.print("Digite o nome da Empresa em que trabalha: ");
        nomeEmpresa = teclado.nextLine();
        System.out.print("Digite o seu Salário: ");
        salario = teclado.nextInt();
        
        System.out.println();
        
        System.out.println(" FICHA FUNCIONAL DE: " + nome);
        System.out.println(" Documentos:");
        System.out.println(" CPF...................... " + cpf);
        System.out.println(" C.I...................... " + identidade);
        System.out.println(" Titulo de eleitor........ " + tituloEleitor);
        System.out.println(" Carteira de Motorista.... " + carteiraMotorista);
        System.out.println(" Empresa: " + nomeEmpresa);
        System.out.println(" Salário: R$" + salario);

        teclado.close();

    }
}