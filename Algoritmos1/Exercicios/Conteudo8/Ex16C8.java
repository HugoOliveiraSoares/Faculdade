
public class Ex16C8 {

    public static void main(String[] args) {
        
        double fx;

        for (int x = 3; x <= 12; x++)
        {
            fx = Math.sqrt( Math.pow(x, 2) - 3 );
            System.out.printf("x = %d f(x) = %.4f\n", x, fx);
        }

    }

}