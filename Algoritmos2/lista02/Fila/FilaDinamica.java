package Fila;

public class FilaDinamica {
    private Celula inicio; // Referencia para o inicio da fila
    private Celula fim; // Referencia para o fim da fila
    private int contador; // Contador de itens na fila

    public FilaDinamica(){
        inicio = null;
        fim = null;
        contador = 0;
    }

    public boolean vazia() {
        return contador == 0;
    }

    public int tamanho(){
        return contador;
    }

    public void enfileirar(Object novoItem) {
        Celula novaCelula = new Celula(novoItem);
        if (inicio == null) {
            inicio = novaCelula;
        } else {
            fim.anterior = novaCelula;
        }
        fim = novaCelula;
        contador++;
    }

    public Object desenfileirar() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            x = inicio.item;
            inicio = inicio.anterior;
            if (inicio == null) {
                fim = null;
            }
            contador--;
        }
        
        return x;
    }

    public Object consultarInicio() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            x = inicio.item;
        }

        return x;
    }

    public Object consultarFim() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            x = fim.item;
        }

        return x;
    }

    public Object copia() {
        FilaDinamica tempFila = new FilaDinamica();
        FilaDinamica copiaFila = new FilaDinamica();
        
        while (!vazia()) {
            tempFila.enfileirar(desenfileirar());
        }
        while (!tempFila.vazia()) {
            Object x = tempFila.desenfileirar();
            enfileirar(x);
            copiaFila.enfileirar(x);
        }
        return copiaFila;
    }

    public String toString() {
        String filaCompleta = "";
        if (vazia()) {
            filaCompleta = null;
        } else {
            for (int i = 0; i < contador; i++) {
                Object tempObject = desenfileirar();
                filaCompleta = filaCompleta + "\n" + tempObject;
                enfileirar(tempObject);
            }
        }
        return filaCompleta;
    }

    public Celula buscar(Object alvo) {
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            Celula x = inicio;
            while (x != null) {
                if (x.item.equals(alvo)) {
                    return x;
                }
                x = x.anterior;
            }
        }
        return null;
    }
}
