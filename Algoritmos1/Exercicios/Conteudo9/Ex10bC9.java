public class Ex10bC9 {
    
    public static void main(String[] args) {
        
        double serie = 0, num , den;

        for (int aux = 1; aux <= 100; aux++)
        {
            num = aux * 2;
            den = aux * 3;
            serie += num / den;
        }

        serie = 1 + Math.sqrt(serie);
        System.out.println("B = "+serie);

    }

}
