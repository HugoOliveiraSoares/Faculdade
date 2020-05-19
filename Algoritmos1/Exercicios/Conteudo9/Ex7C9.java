public class Ex7C9 {

    public static void main(String[] args) {
        
        double serie = 0, num, den;

        for (int aux = 0, aux1 = 7; aux < 6; aux++, aux1 += 6) {
            num = aux * 2 + (aux + 1) * 3;
            den = aux1;
            serie += num / den;
        }

        System.out.println("Valor da série = " + serie);
    }
}
