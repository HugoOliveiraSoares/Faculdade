
public class Ex25C8 {

    public static void main(String[] args) {

        for (int aux = 1; aux <= 10; aux++)
        {
            for (int aux1 = 1; aux1 <= aux; aux1++)
            {
                System.out.print(" ");
            }

            System.out.print(" *");
            System.out.println();
        }

        for (int aux = 10; aux >= 1; aux--) {
            
            for (int aux1 = aux; aux1 >= 1; aux1--) {
                System.out.print(" ");
            }

            System.out.print("*");
            System.out.println();
        }
        
    }
}