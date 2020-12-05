public class ListaDinamica {
    
    private Celula inicio; // Referencia para o inicio da lista
    private Celula fim; // Referencia para o fim da lista
    private int contador; // Contador de itens na lista

    //Construtor com referencias e contador nulos
    public ListaDinamica() {
        inicio = fim = null;
        contador = 0;
    }

    // Testar se lista vazia
    public boolean vazia(){
        return contador == 0;
    }

    // Quantidade de intens na lista
    public int tamanho(){
        return contador;
    }

    // Testar se posição valida
    private boolean chaveValida(int x){
        return 1 <= x && x <= contador;
    }

    // Inserir objeto na Lista em uma certa posição
    public void inserir(Object novoItem, int posicao) {
       Celula novaCelula, tempCelula;
       int i;
       if (posicao == contador+1) { // Inserir no fim da lista
            novaCelula = new Celula(novoItem);
            if (inicio ==  null) {
                inicio = novaCelula;
            } else {
                fim.link = novaCelula;
            }
            fim = novaCelula;
            contador++;
       }else{
           if (posicao == 1) { // Inserir no inicio da Lista
               novaCelula = new Celula(novoItem, inicio);
               if (fim == null) {
                   fim = novaCelula;
               }
               inicio = novaCelula;
               contador++;
           } else { // Inserir no meio da Lista
               if (!chaveValida(posicao)) {
                   System.out.println("Erro: Indice invalido!");
               } else {
                   tempCelula = inicio;
                   for (i = 1; i < posicao; i++) {
                      tempCelula = tempCelula.link; 
                   }
                   novaCelula = new Celula(tempCelula.item, tempCelula.link);
                   tempCelula.link = novaCelula;
                   if (tempCelula == fim){
                       fim = novaCelula;
                   }
                   tempCelula.item = novoItem;
                   contador++;
               }
           }
       }
    }

    // Inserir objeto no fim da lista
    public void inserir(Object novoItem) {
        inserir(novoItem, contador+1);
    }

    // Inserir objeto no inicio da lista
    public void inserirInicio(Object novoItem) {
        inserir(novoItem, 1);
    }

    // Inserir objeto no fim da lista
    public void inserirFim(Object novoItem) {
        inserir(novoItem, contador+1);
    }

    // Retirar objeto de uma posição da Lista
    public Object retirar(int posicao) {
        Object x = null;
        Celula tempCelula;
        int i;
        if (vazia()) {
            System.out.println("Erro: Lista vazia!");
        } else {
            if (posicao == 1) {
                x = inicio.item;
                inicio = inicio.link;
                if(inicio == null){
                    fim = null;
                }
                contador--;
            } else {
                if (posicao == contador) { // Retirar no fim da lista
                    tempCelula = inicio;
                    for ( i = 1; i < contador - 1; i++) {
                        tempCelula = tempCelula.link;
                    }
                    x = fim.item;
                    fim = tempCelula;
                    if (fim == null) {
                        inicio = fim;
                    } else {
                        fim.link = null;
                    }
                    contador--;
                } else { // Retirar no meio da lista
                    if (!chaveValida(posicao)) {
                        System.out.println("Erro: Indice invalido!");
                    } else {
                        tempCelula = inicio;
                        for ( i = 1; i < posicao-1; i++) {
                            tempCelula = tempCelula.link;
                        }
                        x = tempCelula.link.item;
                        tempCelula.link = tempCelula.link.link;
                        contador--;
                    }
                }
            }
        }
        return x;
    }

    // Retirar objeto no fim da lista
    public Object retirar() {
        return retirar(contador);
    }

    // Retirar objeto no inicio da lista
    public Object retirarInicio() {
        return retirar(1);
    }

    // Retirar objeto no fim da lista
    public Object retirarFim() {
        return retirar(contador);
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

    public String toString() {
        String listaCompleta = "[";
        if (vazia()) {
            listaCompleta = listaCompleta + null + "]";
        } else {
            Celula listCelula = inicio;
            while (listCelula != null){
                listaCompleta += " " + listCelula.item;
                listCelula = listCelula.link;
            }
            listaCompleta += " ]";
        }
        return listaCompleta;
    }

    public ListaDinamica copiar(ListaDinamica copia) {
        if (vazia()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            Celula tempCelula = inicio;
            while (tempCelula != null) {
                copia.inserir(tempCelula.item);
                tempCelula = tempCelula.link;
            }
        }
        return copia;
    }

}
