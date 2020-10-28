package Pilha;

public class TestePilha {

    private static PilhaEstatica pilhaE; // Instancia a classe PilhaEstatica
    private static PilhaDinamica pilhaD; // Instancia a classe PilhaDinamica
    
    public static void main(String[] args) {
        
        System.out.println("\n>>> Pilha Estatica <<<\n");

        pilhaE = new PilhaEstatica(4); // Inicializa a classe Pilha Estatica

        System.out.println("Topo da pilha: " + pilhaE.consultarTopo());
        System.out.println("A pilha esta vazia? "+ pilhaE.vazia());

        pilhaE.empilhar("Item 1");
        pilhaE.empilhar(3.14);
        pilhaE.empilhar(21);
        System.out.println("Topo da pilha: " + pilhaE.consultarTopo());
        pilhaE.empilhar("Item 2");
        pilhaE.empilhar(99.78);
        System.out.println("Conteúdo da pilha: " + pilhaE.toString());
        System.out.println("Tamanho da pilha: "+ pilhaE.tamanho());
        pilhaE.desemplihar();
        System.out.println("Conteúdo da pilha: " + pilhaE.toString());
        System.out.println("Tamanho da pilha: " + pilhaE.tamanho());

        //=============================================================================

        System.out.println("\n>>> Pilha Dinamica <<<\n");

        pilhaD = new PilhaDinamica(); // Construtor da Pilha Dinamica


        System.out.println("Topo da pilha: "+ pilhaD.consultarTopo());
        System.out.println("A pilha esta vazia? "+ pilhaD.vazia());
        pilhaD.empilhar("Item 1");
        pilhaD.empilhar(3.14);
        pilhaD.empilhar(21);
        System.out.println("Topo da pilha: " + pilhaD.consultarTopo());
        pilhaD.empilhar("Item 2");
        pilhaD.empilhar(99.78);
        System.out.println("Conteudo da pilha: "+ pilhaD.toString());
        System.out.println("Tamanho da pilha: " + pilhaD.tamanho());
        pilhaD.desempilhar();
        System.out.println("Conteudo da pilha: " + pilhaD.toString());
        System.out.println("Tamanho da pilha: " + pilhaD.tamanho());

    }
}
