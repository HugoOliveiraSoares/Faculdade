public class TesteLista {
    public static void main(String[] args) {
        
        // listaEstatica();
        // listaDinamica();
        TesteLista();
        
    }

    private static void listaEstatica() {

        System.out.println("\n Lista Estatica \n");

        ListaEstatica listaEstatica = new ListaEstatica(4);

        System.out.println(listaEstatica.vazia());

        listaEstatica.inserir("A");
        listaEstatica.inserir("B");
        listaEstatica.inserir("C");
        listaEstatica.inserir("D");
        listaEstatica.inserir("E");

        System.out.println("Vazio? " + listaEstatica.vazia());
        System.out.println("Conteudo: " + listaEstatica.toString());
        System.out.println("Tamanho: " + listaEstatica.tamanho());

        System.out.println("Inicio: " + listaEstatica.consultarInicio());
        System.out.println("Fim: " + listaEstatica.consultarFim());

        // for (int i = 1; i <= 4; i++) {
        // listaEstatica.retirar();
        // }

        listaEstatica.retirar();
        listaEstatica.retirarFim();

        System.out.println("Conteudo: " + listaEstatica.toString());

        listaEstatica.inserir(1);
        listaEstatica.inserir(2);

        System.out.println("Conteudo: " + listaEstatica.toString());
        System.out.println("Inicio: " + listaEstatica.consultarInicio());
        System.out.println("Fim: " + listaEstatica.consultarFim());

        listaEstatica.limpar();

        System.out.println("Conteudo: " + listaEstatica.toString());
        System.out.println("Tamanho: " + listaEstatica.tamanho());

        listaEstatica.inserir(1);
        listaEstatica.inserir(2);
        listaEstatica.inserir(3);
        listaEstatica.inserir(4);

        System.out.println("Conteudo: " + listaEstatica.toString());
        System.out.println("Tamanho: " + listaEstatica.tamanho());

        System.out.println("Inicio: " + listaEstatica.consultarInicio());
        System.out.println("Fim: " + listaEstatica.consultarFim());

    }

    private static void listaDinamica() {

        System.out.println("\n Lista Dinamica \n");

        ListaDinamica listaDinamica = new ListaDinamica();
        ListaDinamica listaDinamicaCopia = new ListaDinamica();

        System.out.println(listaDinamica.vazia());

        listaDinamica.inserirFim("A");
        listaDinamica.inserirFim("B");

        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.inserirInicio("C");
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.inserirFim("D");
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.inserir("E", 3);
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.inserir("F", 1000);
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        System.out.println("Vazio? " + listaDinamica.vazia());

        listaDinamica.retirarInicio();
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.retirarFim();
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.retirar(2);
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.retirar(-1);
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.limpar();
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.inserir("B");
        listaDinamica.inserir("A");
        listaDinamica.inserir("C");
        listaDinamica.inserir("D");
        listaDinamica.inserir("E");
        System.out.println("Conteudo: " + listaDinamica.toString());
        System.out.println("Tamanho: " + listaDinamica.tamanho());

        listaDinamica.copiar(listaDinamicaCopia);

        System.out.println("Conteudo listaDinamicaCopia: " + listaDinamicaCopia.toString());
        System.out.println("Tamanho listaDinamicaCopia: " + listaDinamicaCopia.tamanho());

    }

    private static void TesteLista() {

        ListaDinamica listaDinamica = new ListaDinamica();

        listaDinamica.inserir("A");
        listaDinamica.inserir("B");
        listaDinamica.inserir("C");
        listaDinamica.inserir("D");

        System.out.println("Conteudo: "+ listaDinamica.toString());

        listaDinamica.trocarItens("A", "C");

        System.out.println("Conteudo: " + listaDinamica.toString());
        
    }
}
