import java.util.Scanner;

public class Ex05C12 {
    public static void main(String[] args) {
        
        double angulo;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um angulo: ");
        angulo = teclado.nextDouble();

           System.out.println("cos: "+ Math.cos(angulo));
           System.out.println("arco cos: "+ Math.acos(angulo));

           System.out.println("sen:"+ Math.sin(angulo));
           System.out.println("arco sen: "+  Math.asin(angulo));

           System.out.println("tan: "+ Math.tan(angulo));
           System.out.println("arco tan: "+ Math.atan(angulo));

        
        teclado.close();
    }
}