public class MDC {

    public static void main(String[] args) {
    
        System.out.println(mdc(18, 12));

    }

    public static int mdc(int a, int b) {
        
        if (a % b == 0) {
            return b;
        } else {
            return mdc(b, (a % b));
        }

    }
}