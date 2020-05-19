public class Ex6C9 {

    public static void main(String[] args) {

        double serie = 0, num, den;
        
        for (int aux = 0; aux < 20; aux++)
        {
            num = aux + 1;
            den = Math.sqrt((aux + 1) * 2);
            serie += num / den;
        }

        serie += 10;

        System.out.println("Valor da série = " + serie);

    }
    
}