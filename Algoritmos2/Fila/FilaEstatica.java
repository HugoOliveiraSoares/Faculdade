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