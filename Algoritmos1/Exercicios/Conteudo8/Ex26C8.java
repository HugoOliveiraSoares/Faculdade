public class Ex26C8 {

    public static void main(final String[] args) {

        double aux3;

        for (int rep = 1; rep <= 2; rep++)
        {
            aux3 = 0;
            for (int aux1 = 1; aux1 <= 8; aux1++)
            {
                    for (double aux2 = 1; aux2 <= Math.pow(2, aux3); aux2++)
                    {
                        System.out.print("*");
                    }
                    aux3++;

                System.out.println();
            }
            
            for (int aux1 = 7; aux1 >= 1; aux1--) 
            {
                aux3 = aux1 - 1;
                for (double aux2 = Math.pow(2, aux3); aux2 > 0; aux2--) 
                {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

    }

}