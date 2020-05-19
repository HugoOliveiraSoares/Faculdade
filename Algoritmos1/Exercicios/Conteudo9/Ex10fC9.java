public class Ex10fC9 {
    
    public static void main(String[] args) {
        
        double serie = 0, num, den;

        for (int aux = 1; aux <= 100; aux++)
        {
            num = Math.pow(aux, 2);
            den = Math.pow(aux*2, 2);
            serie += num / den;
        }

        System.out.println("F = "+serie);

    }

}