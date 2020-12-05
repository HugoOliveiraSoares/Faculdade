public class Teste_HashTable {
    
    public static void main(String[] args) {
        
        int k, max = 8;

        HashTable table = new HashTable(max);
        table.enderecoAbertoOn();

        table.inserir("36");
        table.inserir("18");
        table.inserir("72");
        table.inserir("43");
        table.inserir("6");
        table.inserir("10");
        table.inserir("5");
        table.inserir("15");

        System.out.println(table.toString());
        System.out.println(table.tamanho());

        k = table.funcaoHash("6", max);
        System.out.println(table.pesquisar("6", k));
        
        k = table.funcaoHash("35", max);
        System.out.println(table.pesquisar("35", k));

        k = table.funcaoHash("10", max);
        table.retirar("10", k);
        
        k = table.funcaoHash("0", max);
        table.retirar("0", k);

        System.out.println(table.toString());
        System.out.println(table.tamanho());

        HashTable table2 = new HashTable();
        table2.enderecoAbertoOff();

        table2.inserir("9");
        table2.inserir("6");
        table2.inserir("7");
        table2.inserir("55");
        table2.inserir("14");
        table2.inserir("31");
        table2.inserir("11");        
        table2.inserir("20");        
        table2.inserir("2");        
        table2.inserir("16");        
        table2.inserir("25");
        table2.inserir("48");

        System.out.println(table2.toString());
        System.out.println(table2.tamanho());

        k = table2.funcaoHash("14", max);
        System.out.println(table2.pesquisar("14", k));

        k = table2.funcaoHash("10", max);
        System.out.println(table2.pesquisar("10", k));

        k = table2.funcaoHash("2", max);
        table2.retirar("2", k);

        k = table2.funcaoHash("25", max);
        table2.retirar("25", k);

        k = table2.funcaoHash("48", max);
        table2.retirar("48", k);

        k = table2.funcaoHash("31", max);
        table2.retirar("31", k);
        
        k = table2.funcaoHash("1", max);
        table2.retirar("1", k);

        System.out.println(table2.toString());
        System.out.println(table2.tamanho());

    }
}
