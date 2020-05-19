public class Ex15C8 {

    public static void main(String[] args) {

        int media, soma = 0, count = 0;
        
        for (int numero = 1000; numero <= 2000; numero++)
        {
            if (numero % 2 != 0) 
            {
                soma += numero;
                count++;
            }
        }

        media = soma / count;

        System.out.println("Média dos números ímpares: " + media);

    }

}