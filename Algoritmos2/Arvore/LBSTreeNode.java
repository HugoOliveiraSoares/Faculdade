public class LBSTreeNode { // Linked Binary Search Tree Node (Celula)

    Object item; // armazenador de um item 
    LBSTreeNode linkEsquerdo; // referencia para um item a esquerda
    LBSTreeNode linkDireito; // referencia para um item a direita

    // Construtor padrao inicialmente vazio
    public LBSTreeNode() {
        this( null );
    }

    public LBSTreeNode( Object valorItem){
        item         = valorItem;
        linkEsquerdo = null;
        linkDireito  = null;
    }

    // Comparar o valor do nodo com o do parametro
    public int compararCom( Object valorItem) {
        String chaveAtual = (String) this.item;
        String chaveValor = (String) valorItem;
        return chaveAtual.compareTo( chaveValor );
    }

    // Converter contendo da classe para String
    public String toString() {
        return item.toString();
    }

}