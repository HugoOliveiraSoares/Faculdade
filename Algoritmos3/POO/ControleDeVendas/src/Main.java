import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t Controle de Vendas ");
        System.out.println("1 - Cadastrar cliente ");
        System.out.println("2 - Cadastrar produtos ");
        System.out.println("3 - Produtos disponivies ");
        System.out.print("Selecione uma opção: ");
        int op = scanner.nextInt();
        scanner.nextLine();

        if (op == 1){ // Cadastrar cliente

            int cpf;
            String nome;
            int idade;

            System.out.print("Insira um nome: ");
            nome = scanner.nextLine();
            System.out.print("Insira o cpf: ");
            cpf = scanner.nextInt();
            System.out.print("Insira a idade: ");
            idade = scanner.nextInt();

            Cliente cliente = new Cliente(cpf, nome, idade);

            System.out.println(cliente);

            /* TESTE */

//            Cliente platinum2 = new ClientePlatinum(cliente);

            ClientePlatinum platinum = new ClientePlatinum(cliente);

            System.out.println(platinum);

            ClienteOuro ouro = new ClienteOuro(cpf, nome, idade, 0);

            System.out.println(ouro);

            ClientePrata prata = new ClientePrata(cliente);

            System.out.println(prata);

        } else if (op == 2){ // Cadastrar Produto
            Produto produto = new Produto();

            System.out.print("Insira o nome do produto: ");
            produto.setNome(scanner.nextLine());
            System.out.print("Insira o codigo de barras: ");
            produto.setCodigoDeBarras(scanner.nextInt());
            System.out.print("Insira o preço do produto: ");
            produto.setPreco(scanner.nextInt());
            System.out.print("Insira a quantidade que sera colocada em estoque: ");
            produto.setQuantidade(scanner.nextInt());

            System.out.println(produto);

        }

        scanner.close();

    }
}
