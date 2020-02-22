// Autor: Hugo Oliveira Soares
// FUNÇAO: SOMA DUAS MATRIZES QUADRADAS 4x4 C=A*B
// DATA: 21/02/2020
#include <stdio.h>
#include <stdlib.h>

int main() 
{
	int i, j = 0; // CONTADOR DE LINHAS E  COLUNAS
	int a[4]; // ELEMENTO DA MATRIZ
	int linha[4] = {}; // VETOR QUE ARMAZNENA OS ELEMENTOS DE CADA LINHA

	// MATRIZES A SEREM MULTIPLICADADAS
    int matrizA[4][4] = {{1, 2, 4, 0},
                        {1, -1, 3, 2},
                        {0, 5, 8, -3},
                        {2, 4, 8,  0}};

    int matrizB[4][4] = {{3, 4, 4, 1},
                        {1, 2, 3,  4},
                        {6, 5, 2,  7},
                        {5, 4, 3, -2}};
	i = 0;
	while (i <= 3)
	{
		for(int x = 0; x <= 3; x++) // LOOP AUXILIAR PARA TROCA DE COLUNAS NA MATRIZ B
		{
			for (j = 0; j <= 3; j++)
			{
				a[j] = matrizA[i][j] * matrizB[j][x];
			}	
			linha[x] = a[0] + a[1] + a[2] + a[3];
		}
		i++; //CONTADOR DAS LINHAS DA MATRIZ A
	// MOSTRA AS LINHAS DA MATRIZ C
		for (int x = 0; x <= 3; x++)
		{
			printf("%i ", linha[x]);
		}
		printf("\n");
	}	
    return 0;
}