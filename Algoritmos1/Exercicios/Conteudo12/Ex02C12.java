import java.util.Scanner;

public class Ex02C12 {
    public static void main(String[] args) {
        
        double x;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor para x: ");
        x = teclado.nextDouble();

        while (x != -1) 
        {
            System.out.println("x = "+ x +" -> f(x) = "+ funcao(x));

            System.out.print("Digite um valor para x: ");
            x = teclado.nextDouble();
            
        }

        teclado.close();

    }

    static double funcao(double _x)
    {
        double _fx = 0;

        if (_x < 4) 
        {
            _fx = (5*_x + 3) / Math.sqrt(16 - Math.pow(_x, 2));

        } else if(_x == 4) 
        {
           _fx = 0;
        
        }else
        {
            _fx = (5*_x + 3) / Math.sqrt(Math.pow(_x, 2) - 16);
        }

        return _fx;
    }

}