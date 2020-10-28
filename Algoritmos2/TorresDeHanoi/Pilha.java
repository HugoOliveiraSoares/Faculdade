/**
 * Implementação da PilhaEstatica para o uso da solução do exercicio das torres de Hánoi
 */
public class Pilha {

    private int topo; // Indicador do topo da pilha
    private int contador; // Contador de itens na pilha
    private int capacidade; // Capacidade macima da pilha
    private Object[] itemArray; // Armazenador de objetos/itens/elementos

    // Quando na calsse main está instanciado sem um parametro, executa este construtor com o tamanho 10
    public Pilha(){ // Construtor
        this(10); //Torre(3)
    }

    public Pilha( int maxCapacidade ){ // Construtor
        topo = 0;
        contador = 0;
        capacidade = maxCapacidade;
        itemArray = new Object[capacidade];
    }

    public boolean vazia(){
        return topo == 0;
    }

    public int tamanho(){
        return contador;
    }

    public void empilhar(Object novoItem){
        if (topo == capacidade) {
            System.out.println("Erro: Capacidade da Torre foi exedida!");
        } else {
            itemArray[topo++] = novoItem;
            contador++;
        }
    }

    public Object desemplihar() {
        Object x = null;
        if(vazia()){
            System.out.println("ERRO: Torre vazia!");
        }else{
            x = itemArray[ --topo];
            contador--;
        }
        return x;
    }

    public String consultarTopo() {
        Object x = null;
        if(vazia()){
            System.out.println("ERRO: Torre vazia!");
        }else{
            x = itemArray[topo - 1];
        }
        return x.toString();
    }

    public String toString() {
        String pilhaCompleta = "";
        if (vazia()) {
            pilhaCompleta = null;
        } else {
            for (int i = topo -1; i >= 0; i--) {
                pilhaCompleta = pilhaCompleta + "\n" + itemArray[i];
            }
        }
        return pilhaCompleta;
    }

    public Object consultarElemento(int i) {
        Object x = null;
        if (i > contador) {
            return " ";
        } else {
            x = itemArray[topo - i];
        }
        return x;
    }

}