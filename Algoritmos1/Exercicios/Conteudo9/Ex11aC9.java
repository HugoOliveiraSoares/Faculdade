public class Ex11aC9 {

    public static void main(String[] args) {
        
        double serie = 0, num, den;

        for (int aux = 1; aux <= 100; aux++)
        {
            num = aux + (aux * 7 - 6);
            den = Math.pow(4, aux - 1);
            serie += num / den;
        }

        serie = Math.cbrt(serie);
        System.out.println("A = "+serie);

    }
    
}