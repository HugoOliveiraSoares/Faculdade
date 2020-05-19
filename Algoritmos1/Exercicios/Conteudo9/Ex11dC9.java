public class Ex11dC9 {

    public static void main(String[] args) {
        
        double serie = 0, num, den = 1;

        for (int aux = 1; aux <= 100; aux++)
        {
            num = Math.pow(aux, 3);
            den = Math.pow(10, aux - 1);
            serie += num / den;
        }

        System.out.println("D = "+serie);

    }
    
}