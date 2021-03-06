import java.util.*;

public class Ordenacao {
    
    public int[] geradorAleatorio(int qtde, int interval) {
        
        Random gerador = new Random();
        int[] numeros = gerador.ints(0, interval).limit(qtde).toArray();

        return(numeros);
    }

    public String exibirVetor(int[] vet) {
        
        String strVet = "";

        for (int i = 0; i < vet.length; i++) {
            strVet += vet[i] + " ";
        }

        return(strVet);
    }

    public int[] bubbleSort(int[] vet) {
        
        int aux = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        return vet;
    }

    public int[] insertionSort(int[] vet) {

        int chave;
        int j;
        for (int i = 2; i < vet.length; i++) {
            chave = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] > chave) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = chave;
        }

        return vet;
    }

    public int[] selectionSort(int[] vet) {
        int min_index = 0;
        int aux = 0;

        for (int j = 0; j < vet.length - 1; j++) {
            min_index = j;
            for (int i = j; i < vet.length; i++) {
                if (vet[i] < vet[min_index]) {
                    min_index = i;
                }
            }
            if (vet[j] > vet[min_index]) {
                aux = vet[j];
                vet[j] = vet[min_index];
                vet[min_index] = aux;
            }
        }

        return vet;
    }

    public int[] quickSort(int[] vet, int inicio, int fim) { 
        if (inicio < fim) {
            int posicaoPivo = separar(vet, inicio, fim);
            quickSort(vet, inicio, posicaoPivo - 1);
            quickSort(vet, posicaoPivo + 1, fim); 
        }
        return vet;
    }

    private int separar(int[] vet, int inicio, int fim) {
        
        int pivo = vet[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vet[i] <= pivo) // Trabalha a esquerda do pivo
                i++;
            else if(pivo < vet[f]) // Trabalha a direita do pivo
                f--;
            else {
                int troca = vet[i];
                vet[i] = vet[f];
                vet[f] = troca;
                i++;
                f--;
            }
        }
        vet[inicio] = vet[f];
        vet[f] = pivo;

        return f;
    }

    public int[] MergeSort(int[] vet, int baixo, int alto) {
        
        if (baixo < alto) {
            int medio = (baixo + alto) / 2;
            MergeSort(vet, baixo, medio);
            MergeSort(vet, medio+1, alto);
            Merge(vet, baixo, medio, alto);
        }
        
        return vet;
    }

    private void Merge(int[] vet, int baixo, int medio, int alto) {
        int[] vetAux = new int[vet.length];
        for (int i = baixo; i <= alto; i++) {
            vetAux[i] = vet[i];
        }

        int vetEsquerdo = baixo;
        int vetDireito  = medio + 1;
        int atual       = baixo;

        while (vetEsquerdo <= medio && vetDireito <= alto) {
            if (vetAux[vetEsquerdo] <= vetAux[vetDireito] ){
                vet[atual] = vetAux[vetEsquerdo];
                vetEsquerdo++;
            }else{
                vet[atual] = vetAux[vetDireito];
                vetDireito++;
            }
            atual++;
        }
        int restante = medio - vetEsquerdo;
        for (int i = 0; i <= restante; i++) {
            vet[atual + i] =  vetAux[vetEsquerdo+i];
        }
    }

}
