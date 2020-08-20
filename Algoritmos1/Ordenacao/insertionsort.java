public class insertionsort {
    public static void main(String[] args) {
        int lista[] = new int[]{4,7,2,5,4,0};

        int chave;
        int j;
        for (int i = 1; i < lista.length; i++) {
            chave = lista[i];
            j = i - 1;
            while (j >= 0 && lista[j] > chave) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = chave;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        System.out.println();
    }
}