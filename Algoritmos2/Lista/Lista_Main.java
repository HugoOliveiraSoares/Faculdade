public class Lista_Main {
    public static void main(String[] args) {
        ListaEstatica listaE = new ListaEstatica( 14 );
        
        listaE.inserir(3);
        listaE.inserir(1);
        listaE.inserir(5);
        listaE.inserir(2);
        listaE.inserir(8);
        listaE.inserir(7);
        listaE.inserir(4);
        listaE.inserir(6);
        listaE.inserir(9);
        
        listaE.inserir("C");
        listaE.inserir("A");
        listaE.inserir("D");
        listaE.inserir("B");
        
        System.out.println(listaE.toString());

        listaE.ordenar();

        System.out.println(listaE.toString());
        }
}
