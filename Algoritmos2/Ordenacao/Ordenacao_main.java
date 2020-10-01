public class Ordenacao_main {

    private static Ordenacao order = new Ordenacao();

    public static void main(String[] args) {

        int[] numeros = order.geradorAleatorio(10, 10);
        System.out.println("Vetor original: " + order.exibirVetor(numeros));

        System.out.println("Vetor ordenado: ");
        int[] numerosOrdenados;
        numerosOrdenados = order.bubbleSort(numeros);
        System.out.println(order.exibirVetor(numerosOrdenados));
        
        numerosOrdenados = order.insertionSort(numeros);
        System.out.println(order.exibirVetor(numerosOrdenados));
        
        numerosOrdenados = order.quickSort(numeros, 0, numeros.length - 1);
        System.out.println(order.exibirVetor(numerosOrdenados));

        numerosOrdenados = order.MergeSort(numeros, 0, numeros.length-1);
        System.out.println(order.exibirVetor(numerosOrdenados));
        
    }
}
