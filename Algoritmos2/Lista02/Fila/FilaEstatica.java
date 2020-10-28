package Fila;

/**
 * FilaEstatica
 */
public class FilaEstatica {

    private int inicio; // indicador do inico da fila
    private int fim; 
    private int contador;
    private int capacidade;
    private Object[] itemArray;

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

    // public Object buscar(int positem) { // pesquisa pelo item na posição informada no parametro da função

    //     if (vazia()) {
    //         return "Erro: Fila vazia!";
    //     } else {
    //         return positem > capacidade? "Item invalido!": itemArray[positem-1];
    //     }

    // }

    public Object buscar(Object item) {
        Object x = null;
        if (vazia()) {
            x = " Erro: Fila vazia!";
        } else {
            int j = inicio;
            for (int i = 0; i < contador; i++) {
                if (itemArray[j].equals(item)) {
                    x = itemArray[j];
                }
                j = (j + 1) % capacidade;
            }
        }
        return x;
    }

}