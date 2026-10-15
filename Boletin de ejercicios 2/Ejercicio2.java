
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Introduce valor de un lado del cuadrado: ");

        double lado = input.nextDouble();
        double area = lado * lado;

        System.out.println("El área de un cuadrado es: " + area);

        input.close();

    }

}
