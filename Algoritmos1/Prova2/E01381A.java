/*
*
* Autor: Hugo Oliveira Soares
*
*/
public class E01381A {
    public static void main(String[] args) {
        
        int n1, n2, n3;

        for (int aux = 100; aux <= 999; aux++)
        {
            n1 = aux / 100;
            n2 = aux / 10 % 10;
            n3 = aux % 10;
        
            if (Math.pow(n1, 2) == Math.pow(n2, 2) + Math.pow(n3, 2)) 
            {
                System.out.println(aux);
            }
        }

    }
    
}