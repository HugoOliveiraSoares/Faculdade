/**
 * FilaEstatica
 */
public class FilaEstatica {

    private int inicio; // indicador do inico da fila
    private int fim; // Indicador do fim da fila
    private int contador; // Contador de elementos no fila
    private int capacidade; // Capacidade maxima de fila
    private Object[] itemArray; // Armazenador de objetos

    public FilaEstatica(){
        this(100);
    }

    public FilaEstatica(int maxCapacidade){

        inicio = 0;
        fim = 0;
        contador = 0;
        capacidade = maxCapacidade;
        itemArray = new Object[capacidade];
    }

    public boolean vazia() {
        return contador == 0;
    }

    public int tamanho() {
        return contador;
    }

    public void enfileirar(Object newItem) {
        if (contador == capacidade) {
            System.out.println("Erro: Capacidade da Fila foi excedida!");
        } else {
            itemArray[fim] = newItem;
            fim = (fim + 1) % capacidade;
            contador++;
        }
    }

    // public void enfileirarComPenalidade(Object item) {
    //     int posicaoItem = buscar(item); // Salva a posição do item a ser penalizado

    //     if (posicaoItem >= 0) { // Verifica se encontrou o item
    //         Object tempItem = itemArray[posicaoItem]; // Salva temporariamente o item a ser penalizado
    //         int f = fim == 0 ? capacidade - 1 : fim - 1; // Evita de acessar uma posição invalida caso fim estiver em 0
    //         for (int i = posicaoItem; i < f; i = (i + 1) % capacidade) { // move os itens uma posição a frente para
    //                                                                      // reposicionar o item penalizado no fim
    //             itemArray[i] = itemArray[i + 1];
    //         }
    //         itemArray[f] = tempItem; // posiciona o item no fim da fila (fim-1)
    //     } else {
    //         System.out.println("O item a ser penalizado não existe na Fila!");
    //     }
    // }

    public void enfileirarComPenalidade(Object item) {
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            FilaEstatica filaAux = new FilaEstatica(capacidade);

            while (!vazia()) {
                Object itemAtual = desenfileirar();
                if (itemAtual != item) {
                    filaAux.enfileirar(itemAtual);
                }
            }
            while (!filaAux.vazia()) {
                enfileirar(filaAux.desenfileirar());
            }
            enfileirar(item);
        }
    }

    public int buscar(Object item) { // retorna a posição do elemento a ser buscado, retorna -1 se não encontrado
        int x = -1;
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            int j = inicio;
            for (int i = 0; i < contador; i++) {
                if (itemArray[j].equals(item)) {
                    x = j; // Salva a posição do item pesquisado
                }
                j = (j + 1) % capacidade;
            }
        }
        return x;
    }

    public Object desenfileirar() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            x = itemArray[inicio];
            inicio = (inicio + 1) % capacidade;
            contador--;
        }
        return x;
    }
    
    public Object consultarInicio() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            x =  itemArray[inicio];
        }
        return x;
    }

    public Object consultarFim() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            if (fim == 0) {
                x =  itemArray[capacidade-1];
            }else{
                x = itemArray[fim-1];
            }
        }
        return x;
    }

    public String toString() {
        String filaCompleta = "";
        if (vazia()) {
            filaCompleta = null;
        } else {
            int j = inicio;
            for (int i = 0; i < contador; i++) {
                filaCompleta = filaCompleta + "\n" + itemArray[j];
                j = (j + 1) % capacidade;
            }
        }

        return filaCompleta;
    }
}