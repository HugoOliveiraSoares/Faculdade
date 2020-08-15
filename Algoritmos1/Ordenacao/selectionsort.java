public class selectionsort {
    public static void main(String[] args) {
        
        int lista[] = new int[]{7,5,1,8,3};

        int alredy_sorted[] = new int[]{1, 2, 3, 4, 5, 6, 9, 20, 22, 23, 28, 
                    32, 34, 39, 40, 42, 76, 87, 99, 112};

        int inverted[] = new int[]{117, 90, 88, 83, 81, 77, 74, 69, 64, 63, 51,
            50, 49, 42, 41, 34, 32, 29, 28, 22, 16, 8, 6, 5, 3, 1};

        int repeated[] = new int[]{7, 7, 7, 7, 7, 1, 1, 9, 9, 0, 4, 4, 4, 5, 4, 5, 7, 1};

        for (int i = 0; i < repeated.length; i++) {
            System.out.print(repeated[i]+" ");
        }

        System.out.println("\nOrdenado: ");
        selectionSort(repeated);
        
    }

    private static void selectionSort(int[] lista) {
        int min_index = 0;
        int aux = 0;

        for (int j = 0; j < lista.length - 1; j++) {
            min_index = j;
            for (int i = j; i < lista.length; i++) {
                if (lista[i] < lista[min_index]) {
                    min_index = i;
                }
            }
            if (lista[j] > lista[min_index]) {
                aux = lista[j];
                lista[j] = lista[min_index];
                lista[min_index] = aux;
            }
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        System.out.println();
    }
}