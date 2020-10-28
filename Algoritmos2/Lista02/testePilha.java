// IMPLEMENTAÇÃO PARA O METODO DE INVERTER A PILHA ESTATICA
import Pilha.*;

public class testePilha {
    
    private static PilhaEstatica pilha1;
    private static PilhaDinamica pilha2;

    public static void main(String[] args) {
        
        pilha1 = new PilhaEstatica(4);

        pilha1.empilhar("A");
        pilha1.empilhar("B");
        pilha1.empilhar("C");

        System.out.println("Original: "+ pilha1.toString());
        pilha1.inverterPilha();
        System.out.println("\nInvertido: " + pilha1.toString());

        pilha1.empilhar("D");
        System.out.println(pilha1.toString());

        pilha1.inverterPilha();
        System.out.println(pilha1.toString());

        pilha2 = new PilhaDinamica();
        pilha2.empilhar("A");
        pilha2.empilhar("B");
        pilha2.empilhar("C");

        System.out.println("Pilha Original: "+pilha2.toString());
        pilha2.inverterPilha();
        System.out.println("\nInvertida: "+pilha2.toString());

        pilha2.empilhar("D");
        System.out.println(pilha2.toString());
        pilha2.inverterPilha();
        System.out.println(pilha2.toString());



    }
}
