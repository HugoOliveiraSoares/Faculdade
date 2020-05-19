public class Ex22C8 {

    public static void main(String[] args) {
        
        int n1 = 0,n2 = 0,n3 = 0,n4 = 0, media = 0, count = 0, soma = 0;

        for (int aux = 1000; aux <= 9999; aux++)
        {
            n1 = aux / 1000;
            n2 = aux / 100 % 10;
            n3 = aux % 100 / 10;
            n4 = aux % 10;

            if ((n1 == n4 && n2 == n3) || (n1 == n3 && n2 == n4) ) 
            {
                soma += aux;
                count++;
                System.out.println(aux);
            }
        }

        media = soma / count;
        System.out.println("A media é: "+media);
    }

}