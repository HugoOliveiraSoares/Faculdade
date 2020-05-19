public class Ex10cC9 {

    public static void main(String[] args) {
        
        double serie = 0, num , den;

        for (int aux = 1; aux <= 100; aux++)
        {
            num = aux * 2 - 1;
            den = aux * 2;
            serie += num / den;
        }

        System.out.println(serie);
        serie = 1/3.0 * Math.pow(serie, 2);
        System.out.println("C = "+serie);

    }
    
}