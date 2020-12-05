public class LBSTree {
    
    protected LBSTreeNode raiz; // indicador da raiz da arvore
    protected int contador; // contador de elementos na arvore
    protected String treeString; // armazenador de itens na arvore

    public final int PreOrder   = 1; // Raiz -> Esquerda -> Direita
    public final int InOrder    = 2; // Esquerda -> Raiz -> Direita
    public final int PostOrder  = 3; // Esquerda -> Direita -> Raiz
    public final int InOrderMax = 4;

    // Construtor padrão inicialmente vazia
    public LBSTree(){
        raiz = null;
        contador = 0;
    }

    // Testar se arvore vazia
    public boolean vazia() {
        return raiz == null;
    }

    // Quantidade de itens na arvore
    public int tamanho() {
        return contador;
    }

    // Inserir objeto na arvore
    public void inserir( Object novoItem) {
        raiz = inserir(novoItem, raiz);
    }

    // Inserir cadeia de caracteres na arvore
    public LBSTreeNode inserir( Object novoItem, LBSTreeNode treeRef){
        int resultado;
        if (treeRef == null) { // Arvore vazia
            LBSTreeNode newNode = new LBSTreeNode(novoItem);
            treeRef = newNode;
            contador++;
        } else {
            resultado = treeRef.compararCom(novoItem);
            if (resultado > 0)
                treeRef.linkEsquerdo = inserir(novoItem, treeRef.linkEsquerdo);
            else
                treeRef.linkDireito = inserir(novoItem, treeRef.linkDireito);
        }
        return treeRef;
    }

    // Retirar um item da arvore
    public void retirar( Object item) {
        retirar(item, raiz);
    }

    // Remove um item da arvore
    public void retirar(Object item, LBSTreeNode treeRef) {
        LBSTreeNode antecessor = null;
        if (vazia()) {
            System.out.println("Erro: Árvore vazia!");
        } else {
            if (buscar(item) == null) {
                System.out.println("Erro: Item inexistente!");
            } else {
                // Obtem o sucessor do item a ser retirado
                while (treeRef != null && treeRef.item != item){
                    antecessor = treeRef;
                    if (treeRef.compararCom(item) > 0)
                        treeRef = treeRef.linkEsquerdo;
                    else 
                        treeRef = treeRef.linkDireito;
                }
                if (treeRef.linkEsquerdo == null && treeRef.linkDireito == null) {
                    if (treeRef != raiz) { // Não é a raiz
                        if( treeRef == antecessor.linkEsquerdo)
                            antecessor.linkEsquerdo = null;
                        else
                            antecessor.linkDireito = null;
                    } else { // É a raiz
                        raiz = null;
                    }
                } else if (treeRef.linkEsquerdo != null && treeRef.linkDireito != null){
                    LBSTreeNode sucessor;
                    // if(treeRef == raiz)
                        sucessor = valorMaximo(treeRef.linkEsquerdo);
                    // else
                        // sucessor = valorMinimo( treeRef.linkDireito);
                    Object valorItem = sucessor.item;
                    retirar(sucessor.item);
                    treeRef.item = valorItem;
                }else{ // Ramo com apenas um filho
                    LBSTreeNode folha = (treeRef.linkEsquerdo != null) ? treeRef.linkEsquerdo : treeRef.linkDireito;
                    if (treeRef != raiz){
                        if( treeRef == antecessor.linkEsquerdo)
                            antecessor.linkEsquerdo = folha;
                        else
                            antecessor.linkDireito = folha;
                    } else {
                        raiz = folha;
                    }
                }
            }
        }
    }

    // Encontra o item com maior valor na subarvore
    protected LBSTreeNode valorMaximo(LBSTreeNode treeNode){
        while (treeNode.linkDireito != null)
            treeNode = treeNode.linkDireito;
        return treeNode;
    }

    protected LBSTreeNode valorMinimo(LBSTreeNode treeNode) {
        while (treeNode.linkEsquerdo != null)
            treeNode = treeNode.linkEsquerdo;
        return treeNode;
    }

    // Procurar cadeia de caracteres na arvore
    LBSTreeNode buscar(Object valorItem){
        LBSTreeNode treeRef = raiz;
        int resultado = 1;
        while (treeRef != null && resultado != 0 ) {
            resultado = treeRef.compararCom(valorItem);
            if (resultado > 0) {
                treeRef = treeRef.linkEsquerdo;
            } else {
                if (resultado < 0)
                    treeRef = treeRef.linkDireito;
            }
        }
        return treeRef;
    }

    LBSTreeNode treeSearch(LBSTreeNode treeRef ,Object item){
        if (treeRef == null || item == treeRef.item){
            return treeRef;
        } 
        if (treeRef.compararCom(item) > 0 ) {
            return treeSearch(treeRef.linkEsquerdo, item);
        }else{
            return treeSearch(treeRef.linkDireito, item);
        }
    }

    // Percorrer os nodos na arvore em ordem
    protected void inOrder(LBSTreeNode treeRef) {
        if (treeRef != null) {
            treeString = treeString + "(";
            inOrder(treeRef.linkEsquerdo);
            treeString = treeString + " " + treeRef.item + " ";
            inOrder(treeRef.linkDireito);
            treeString = treeString + ")";
        }
    }

    // Percorrer os nodos na arvore em pre-ordem
    protected void preOrder(LBSTreeNode treeRef) {
        if (treeRef != null) {
            treeString = treeString + "(";
            treeString = treeString + " " + treeRef.item + " ";
            preOrder(treeRef.linkEsquerdo);
            preOrder(treeRef.linkDireito);
            treeString = treeString + ")";
        }
    }

    // Percorrer  os nodos na arvore em pos-ordem
    protected void postOrder(LBSTreeNode treeRef) {
        if (treeRef != null) {
            treeString = treeString + "(";
            postOrder(treeRef.linkEsquerdo);
            postOrder(treeRef.linkDireito);
            treeString = treeString + " " + treeRef.item + " ";
            treeString = treeString + ")";
        }
    }

    protected void inOrderMax(LBSTreeNode treeRef) {
        if (treeRef != null) {
            treeString = treeString + "(";
            inOrderMax(treeRef.linkDireito);
            treeString = treeString + " " + treeRef.item + " ";
            inOrderMax(treeRef.linkEsquerdo);
            treeString = treeString + ")";
        }
    }

    // Percorrer os nodos na arvore e ordem
    public String caminhar() {
        return caminhar(InOrder);
    }

    public String caminhar(int modo) {
        
        treeString = "\n";
        switch (modo) {
            case PreOrder:
                preOrder(raiz);
                break;
            case InOrder:
                inOrder(raiz);
                break;
            case PostOrder:
                postOrder(raiz);
                break;
            case InOrderMax:
                inOrderMax(raiz);
                break;
            default:
                System.out.println("Erro: Modo de caminhamento desconhecido!");
        }

        return treeString;
    }

    // Converter conteúdo da classe para String com caminhamento em ordem
    public String toString() {
        treeString = "";
        inOrder(raiz);
        return treeString;
    }

    public int altura(LBSTreeNode atual) {
        
        if (atual == null || (atual.linkEsquerdo == null && atual.linkDireito == null)) {
            return 0;
        } else {

            if (altura(atual.linkEsquerdo) > altura(atual.linkDireito))
                return altura(atual.linkEsquerdo) + 1;
            else
                return altura(atual.linkDireito) + 1;
        }
    }

    public Object consultarRaiz() {
        Object x = null;
        if (!vazia())
            x = this.raiz;
        else
            System.out.println("Erro: Arvore vazia");
            
        return x;
    }

}
