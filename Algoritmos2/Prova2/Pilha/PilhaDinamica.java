package Pilha;

public class PilhaDinamica {

    private Celula topo; // Referencia para o topo da pilha
    private int contador; // Contador do numero de itens na pilha

    public PilhaDinamica(){
        topo = null;
        contador = 0;
    }

    public boolean vazia() {
        return topo == null;
    }

    public int tamanho(){
        return contador;
    }

    public void empilhar(Object novoItem) {
        Celula novaCelula = new Celula(novoItem);
        novaCelula.anterior = topo;
        topo = novaCelula;
        contador++;
    }

    public Object desempilhar() {
        Object x = null;
        if (vazia()) {
            System.out.println("Erro: Pilha vazia!");
        } else {
            Celula tempCelula = topo;
            topo = topo.anterior;
            contador--;
            x = tempCelula.item;
        }

        return x;
    }

    public Object consultarTopo() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: Pilha vazia!");
        } else {
            x = topo.item;
        }

        return x;
    }

    public Object copiar() {
        PilhaDinamica tempPilha = new PilhaDinamica();
        PilhaDinamica copiaPilha = new PilhaDinamica();

        while (!vazia()) {
            tempPilha.empilhar(desempilhar());
        }
        while (!tempPilha.vazia()) {
            Object x = tempPilha.desempilhar();
            empilhar(x);
            copiaPilha.empilhar(x);
        }
        return copiaPilha;
    }

    public String toString() {
        String pilhaCheia = "";
        if (vazia()) {
            pilhaCheia = null;
        } else {
            PilhaDinamica copiaPilha = (PilhaDinamica) copiar();
            while (!copiaPilha.vazia()) {
                pilhaCheia += "\n" + copiaPilha.desempilhar();
            }
        }
        return pilhaCheia;
    }

}
