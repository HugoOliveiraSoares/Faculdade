package Fila;

public class Celula {
    Object item; // Armazena o item/elemento/objeto
    Celula anterior; // referencia para o objeto anterior

    public Celula(){
        item = null;
        anterior = null;
    }

    public Celula(Object valorItem){
        item = valorItem;
        anterior = null;
    }

    public Celula(Object valorItem, Celula celulaSeguinte){
        item = valorItem;
        anterior = celulaSeguinte;
    }
}
