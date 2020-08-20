public class bubblesort {
    public static void main(String[] args) {
        int lista[] = new int[]{4,9,2,1,7,8};

        int alredy_sorted[] = new int[] { 1, 2, 3, 4, 5, 6, 9, 20, 22, 23, 28, 32, 34, 39, 40, 42, 76, 87, 99, 112 };

        int inverted[] = new int[] { 117, 90, 88, 83, 81, 77, 74, 69, 64, 63, 51, 50, 49, 42, 41, 34, 32, 29, 28, 22,
                16, 8, 6, 5, 3, 1 };

        int repeated[] = new int[] { 7, 7, 7, 7, 7, 1, 1, 9, 9, 0, 4, 4, 4, 5, 4, 5, 7, 1 };

        int aux = 0;
        for (int i = 0; i < repeated.length; i++) {
            for (int j = 0; j < repeated.length - 1; j++) {
                if (repeated[j] > repeated[j + 1]) {
                    aux = repeated[j];
                    repeated[j] = repeated[j + 1];
                    repeated[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < repeated.length; i++) {
            System.out.print(repeated[i]+" ");
        }
        System.out.println();
    }
}