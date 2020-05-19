public class Ex13C9 {

    public static int fatorial(int numero)
    {
        int fatorial = 1;

        for (int aux = 1; aux <= numero; aux++)
        {
           fatorial *= aux; 
        }

        return fatorial;  
    }

    public static void main(String[] args) {

        double serie = 0, num, den;
       
        for (int aux = 1; aux <= 10; aux++)
        {
            num = fatorial(aux);
            den = Math.pow(2, aux) - 1;
            if (aux % 2 == 0) 
                serie -= num / den;
            else 
                serie += num / den;
        }

        System.out.println("Valor da série = "+serie);

    }
    
}
