// IMPLEMENTAÇÃO PARA IMPLEMENTAR O METODO DE BUSCA PARA A FILA ESTATICA

import Fila.*;

public class testeFila {
    
    private static FilaEstatica fila;
    private static FilaDinamica fila2;

    public static void main(String[] args) {
        
        // fila = new FilaEstatica(3);
        
        // System.out.println("Buscando por A item: "+fila.buscar("A"));

        // fila.enfileirar("A");
        // fila.enfileirar("B");
        // fila.enfileirar("C");

        // System.out.println("Conteudo da fila: "+ fila.toString());
        
        // System.out.println("Buscando por A: "+fila.buscar("A"));
        // System.out.println("Buscando por B: "+fila.buscar("B"));
        // System.out.println("Buscando por C: "+fila.buscar("C"));
        // System.out.println("Buscando por D: "+fila.buscar("D"));
        // fila.desenfileirar();
        // System.out.println("Buscando A:"+fila.buscar("A"));

        // System.out.println("Buscando pelo 1° item: "+fila.buscar(1));
        // System.out.println("Buscando pelo 2° item: "+fila.buscar(2));
        // System.out.println("Buscando pelo 3° item: "+fila.buscar(3));
        // System.out.println("Buscando pelo 5° item: "+fila.buscar(5));

        fila2 = new FilaDinamica();

        System.out.println("Buscando por A: " + fila2.buscar("A"));

        fila2.enfileirar("A");
        fila2.enfileirar("B");
        fila2.enfileirar("C");

        System.out.println("Conteudo da fila2: " + fila2.toString());

        System.out.println("Buscando por A: " + fila2.buscar("A"));
        System.out.println("Buscando por B: " + fila2.buscar("B"));
        System.out.println("Buscando por C: " + fila2.buscar("C"));
        System.out.println("Buscando por D: " + fila2.buscar("D"));
        fila2.desenfileirar();
        System.out.println("Buscando por A: " + fila2.buscar("A"));
        System.out.println("Buscando por B: " + fila2.buscar("B"));
        System.out.println("Buscando por C: " + fila2.buscar("C"));
        System.out.println("Buscando por D: " + fila2.buscar("D"));


    }
}
