public class teste {
    public static void main(String[] args) {
        
        PilhaDinamica p = new PilhaDinamica();

        p.empilhar("A");
        p.empilhar("B");
        p.empilhar("C");

        System.out.println(p.toString());

        System.out.println("Elemento 1: " +p.consultarElemento(1));
        System.out.println("Elemento 2: " +p.consultarElemento(2));
        System.out.println("Elemento 3: " +p.consultarElemento(3));

    }
}
