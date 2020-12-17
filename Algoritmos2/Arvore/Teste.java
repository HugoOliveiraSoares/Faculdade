public class Teste {
    public static void main(String[] args) {
        
        LBSTree arvore = new LBSTree();

        String[] vetorNumeros = new String[] { "33", "41", "38", "15", "47", "34", "49", "43" };
        String[] vetorNumeros2 = new String[] { "4", "1", "3", "5", "7", "6", "2"};

        for (int i = 0; i < vetorNumeros.length; i++) {
            arvore.inserir(vetorNumeros[i]);
        }

        System.out.println("Altura: " + arvore.altura());
        System.out.println(arvore.tamanho());

        System.out.println("Grau: "+ arvore.grau("41"));
        System.out.println("Grau: "+ arvore.grau("34"));
        System.out.println("Grau: "+ arvore.grau("43"));
        System.out.println("Grau: "+ arvore.grau("38"));
        System.out.println("PreOrder: " + arvore.caminhar(arvore.PreOrder));
        System.out.println("PostOrder: " + arvore.caminhar(arvore.PostOrder));
        System.out.println("InOrder: " + arvore.caminhar(arvore.InOrder));

    }
}
