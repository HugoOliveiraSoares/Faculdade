public class Ordenacao_main {

    private static Ordenacao order = new Ordenacao();

    public static void main(String[] args) {

        int[] numeros = order.geradorAleatorio(100, 10);
        System.out.println("Vetor original: " + order.exibirVetor(numeros));

        System.out.println("Vetor ordenado: ");
        int[] numerosOrdenados = order.bubbleSort(numeros);
        System.out.println(order.exibirVetor(numerosOrdenados));
        
        numerosOrdenados = order.insertionSort(numeros);
        System.out.println(order.exibirVetor(numerosOrdenados));
        
        numerosOrdenados = order.quickSort(numeros, 0, numeros.length);
        System.out.println(order.exibirVetor(numerosOrdenados));
        
    }
}
