public class Ex2C9 {

    public static void main(String[] args) {
        
        double serie = 0, num = 0, den = 0;

        for (int aux = 0; aux < 99; aux++)
        {
            num = aux + 1;
            den = Math.pow(aux + 1, 2) + aux;
            serie = serie + num / den;
        }

        System.out.println("Valor da série = " + serie);

    }
    
}