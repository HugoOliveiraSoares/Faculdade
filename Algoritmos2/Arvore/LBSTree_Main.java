public class LBSTree_Main {
    public static void main(String[] args) {
        
        String[] vetorNumeros = new String[]{"5", "8", "3", "6", "9", "1", "4", "7", "2", "0"};
        String[] vetorNumeros2 = new String[]{"720", "930", "406", "054", "762", "667", "584", "749", "861", "154", "119", "931", "223", "494", "297", "402", "998", "276", "879", "191", "820", "535", "262", "196", "779", "668", "339", "675", "185", "999"};

        LBSTree arvore = new LBSTree();
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            arvore.inserir(vetorNumeros[i]);
        }

        System.out.println("Tamanho: "+ arvore.tamanho());

        System.out.println("Conteudo: "+ arvore.toString());

        System.out.println("PreOrder: "+ arvore.caminhar(arvore.PreOrder));
        System.out.println("InOrder: "+ arvore.caminhar(arvore.InOrder));
        System.out.println("InOrderMax: "+ arvore.caminhar(arvore.InOrderMax));
        System.out.println("PostOrder: "+ arvore.caminhar(arvore.PostOrder));

        System.out.println("Buscando o item 4: "+ arvore.buscar("4"));
        System.out.println("Buscando o item 4: "+ arvore.treeSearch(arvore.raiz,"4"));
        System.out.println("Raiz: "+ arvore.consultarRaiz());

        System.out.println("Altura: " + arvore.altura(arvore.raiz));

        arvore.retirar(arvore.consultarRaiz());
        System.out.println("PreOrder: " + arvore.caminhar(arvore.PreOrder));
        System.out.println("InOrder:\n " + arvore.caminhar(arvore.InOrder));
        System.out.println("Altura: " + arvore.altura(arvore.raiz));

        arvore.retirar("0");
        arvore.retirar("6");
        arvore.retirar("3");

        System.out.println("PreOrder: " + arvore.caminhar(arvore.PreOrder));
        System.out.println("Altura: " + arvore.altura(arvore.raiz));
      
    }
}
