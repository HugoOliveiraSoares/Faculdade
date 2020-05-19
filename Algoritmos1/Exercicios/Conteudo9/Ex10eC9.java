public class Ex10eC9 {

    public static void main(String[] args) {
        
        double serie = 0, num, den;

        for (int aux = 1; aux <= 100; aux++)
        {
            num = aux;
            den = 3 * (aux *2);
            serie += num / den;
        }

        System.out.println("E = "+serie);
    }
    
}