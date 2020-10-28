public class testeFila {
    private static FilaEstatica filaEstatica;
    public static void main(String[] args) {
        
        filaEstatica = new FilaEstatica(4);

        filaEstatica.enfileirar("A");
        filaEstatica.enfileirar("B");
        filaEstatica.enfileirar("C");
        filaEstatica.enfileirar("D");

        System.out.println("Fila: "+ filaEstatica.toString());
        filaEstatica.enfileirarComPenalidade("B");
        System.out.println("Fila: " + filaEstatica.toString());
        filaEstatica.desenfileirar();
        System.out.println("Fila: " + filaEstatica.toString());
        filaEstatica.enfileirarComPenalidade("C");
        System.out.println("Fila: " + filaEstatica.toString());
        filaEstatica.enfileirar("A");
        System.out.println("Fila: " + filaEstatica.toString());

    }
}
