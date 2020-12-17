public class teste {
    public static void main(String[] args) {
        
        int max = 8;
        HashTable ht = new HashTable(max);
        ht.enderecoAbertoOn();
        // ht.useReHashOn();

            ht.inserir("36");
            System.out.println("36   : " + ht.funcaoHash("36", max));

            ht.inserir("18");
            System.out.println("18   : " + ht.funcaoHash("18", max));
            
            ht.inserir("72");
            System.out.println("72   : " + ht.funcaoHash("72", max));
            
            ht.inserir("43");
            System.out.println("43   : " + ht.funcaoHash("43", max));
            
            ht.inserir("6");
            System.out.println("6   : " + ht.funcaoHash("6", max));
            
            ht.inserir("10");
            System.out.println("10   : " + ht.funcaoHash("10", max));
            
            ht.inserir("5");
            System.out.println("5   : " + ht.funcaoHash("5", max));
            
            ht.inserir("15");
            System.out.println("15   : " + ht.funcaoHash("15", max));
            
            ht.inserir("0");
            System.out.println("0   : " + ht.funcaoHash("0", max));

        System.out.println("Colisão: "+ ht.numeroColisao());
        System.out.println(ht.toString());

        // ht.retirar("10");
        // System.out.println(ht.toString());
        // System.out.println(ht.tamanho());

    }
}
