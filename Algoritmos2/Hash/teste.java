public class teste {
    public static void main(String[] args) {
        
        int max = 8;
        HashTable ht = new HashTable(max);

        System.out.println(ht.funcaoHash("36", max));
        ht.inserir("36");
        System.out.println(ht.funcaoHash("18", max));
        ht.inserir("18");
        System.out.println(ht.funcaoHash("10", max));
        ht.inserir("10");
        System.out.println(ht.funcaoHash("26", max));
        ht.inserir("26");

        System.out.println(ht.toString());
        System.out.println(ht.tamanho());

        ht.retirar("10");
        System.out.println(ht.toString());
        System.out.println(ht.tamanho());

    }
}
