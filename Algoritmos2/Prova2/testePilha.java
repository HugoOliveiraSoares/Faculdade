import Pilha.PilhaEstatica;

public class testePilha {

    private static PilhaEstatica pilhaEstatica;

    public static void main(String[] args) {
        
        PilhaEstatica pilhaE = new PilhaEstatica( 3 );
        
        pilhaE.empilhar("D");
        pilhaE.empilhar("A");
        pilhaE.empilhar("D");
        System.out.println("Pilha: "+pilhaE.toString());
        pilhaE.limparPilha();
        System.out.println("Pilha: " + pilhaE.toString());
        
    }
}
