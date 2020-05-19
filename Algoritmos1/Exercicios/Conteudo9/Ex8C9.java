public class Ex8C9 {
    
    public static void main(String[] args) {
        
        double serie = 0, num, den;

        for (int aux = 1, aux1 = 3, aux2 = 5; aux <= 20; aux++, aux1+=2, aux2+=4)
        {
            num = aux1 * Math.sqrt(aux2);
            den = Math.pow(5, aux);
            serie += num / den;
        }

        serie = Math.pow(serie, 2);
        System.out.println("Valor da série = " + serie);
    }
    
}