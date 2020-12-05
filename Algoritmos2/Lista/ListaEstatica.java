public class ListaEstatica {

    private Object[] itemArray;
    private int capacidade;
    private int contador;
    private int inicio;
    private int fim;

    public ListaEstatica(){
        this(10);
    }

    public ListaEstatica(int capacidadeMaxima){
        itemArray = new Object[capacidadeMaxima];
        capacidade = capacidadeMaxima;
        contador = 0;
        inicio = 0;
        fim = 0;
    }

    public boolean vazia() {
        return contador == 0;
    }

    public int tamanho() {
        return contador;
    }

    public boolean chaveValida(int posicao) {
        return 1 <= posicao && posicao <= contador;
    }

    public void inserir(Object newItem) {
        inserir(newItem, contador+1);
    }

    public void inserirInicio(Object newItem) {
        inserir(newItem, 0);
    }

    public void inserirFim(Object newItem) {
        inserir(newItem, contador+1);
    }

    private void inserir(Object newItem, int posicao) {
        if (contador == capacidade) {
            System.out.println("Erro: Capacidade da Lista foi excedida!");
        } else {
            if (posicao == contador+1) {
                itemArray[fim] = newItem;
                fim = (fim+1) % capacidade;
                contador++;
            } else {
                if (!chaveValida(posicao)) {
                    System.out.println("Erro: Indice invalido!");
                } else {
                    mover(posicao-1,fim,1);
                    itemArray[posicao-1] = newItem;
                    contador++;
                }
            }
        }
    }

    private void mover(int begin, int end, int shift) {
        int i, j;
        if (shift == 1) { // Deslocamento para a direita
            if (end <= capacidade){ // Indice dentro do vetor
                if (end == fim) { // Atualiza indice fim
                    fim = (fim + 1) % capacidade;
                }
                if (fim != inicio) { // A lista não esta cheia
                    j = (end + 1) % capacidade;
                    i = end;
                } else { // Caso a lista esteja cheia
                    j = end;
                    i = end - 1;
                }
                while (i != begin && i != inicio) { // Procede o deslocamento
                    itemArray[j] = itemArray[i];
                    j = i;
                    i = (i + capacidade - 1) % capacidade;
                }
                itemArray[j] = itemArray[i];
                if (begin == inicio) { // Atualiza indice inicio, se lista cheia
                    inicio = (inicio + 1) % capacidade;
                }
            }

        } else { // Deslocamento para a esquerda
            if (begin <= capacidade) { // Indice dentro do vetor
                if (begin == inicio) { // Atualiza indice inicio
                    inicio = (inicio + capacidade -1) % capacidade;
                }
                if (fim != inicio) {
                    j = (begin + capacidade -1) % capacidade;
                    i = begin;
                }else{ // Caso a lista esteja cheia
                    j = begin - 1;
                    i = begin % capacidade;
                }
                while (i != end && i != fim) { // Procede o deslocamento
                    itemArray[j] = itemArray[i];
                    j = i;
                    i = (i + 1) % capacidade;
                }
                if (end != fim) {
                    itemArray[j] = itemArray[i];
                }
                if (end == fim) { // Atualiza indice fim, se lista cheia
                    fim = (fim + capacidade - 1) % capacidade;
                }
            }
        }
    }

    public Object retirar() {
        return retirar(inicio);
    }
    
    public Object retirarFim() {
        return retirar(fim);
    }

    private Object retirar(int posicao) {
        Object x = null;
        int i, j;
        if (vazia()) {
            x = "'Erro: Lista vazia!'";
        } else {
            if (posicao == inicio){
                x = itemArray[inicio];
                inicio = (inicio + 1) % capacidade;
                contador--;
            } else {
                if (posicao == fim) { // Retirar do fim
                    if (fim != 0) {
                        x = itemArray[fim - 1];
                        fim = (fim + capacidade - 1) % capacidade;
                    } else {
                        fim = (fim + capacidade - 1) % capacidade;
                        x = itemArray[fim];
                    }
                    contador--;
                } else { // Retirar do meio
                    if (!chaveValida(posicao)) {
                        x = "'Erro: Indice invalido!'";
                    } else {
                        i = inicio;
                        for (j = 1; j < posicao; j++) {
                            i = (i + 1) % capacidade;
                        }
                        x = itemArray[i];
                        mover(posicao + 1, fim, -1);
                        contador--;
                    }
                }
            }
        }
        return x;
    }

    public String toString() {
        String listaCompleta = "";
        if (vazia()) {
            listaCompleta = null;
        } else {
            int i = inicio;
            for (int j = 1; j <= contador; j++) {
                listaCompleta = listaCompleta + "\n" + itemArray[i];
                i = (i + 1) % capacidade;
            }
        }

        return listaCompleta;
    }

    public void limpar() {
        if (vazia()) {
            System.out.println("Erro fila vazia!");
        } else {
            while (!vazia()) {
                retirar();
            }
        }
    }

    public Object consultarInicio() {
        return itemArray[inicio];
    }

    public Object consultarFim() { 
        return fim == 0 ? itemArray[contador-1] :itemArray[fim-1];
    }
    
}