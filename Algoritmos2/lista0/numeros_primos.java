public class numeros_primos {
    public static void main(String[] args) {
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" : "+isPrimo(i));
        }
        
    }

    public static boolean isPrimo(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}