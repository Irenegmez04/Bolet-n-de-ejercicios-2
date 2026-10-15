
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca la temperatura en grados Celsius: ");

        double celsius = input.nextDouble();
        double equivalenciafahrenheit = 33.8;
        double resultado = celsius * equivalenciafahrenheit;

        System.out.println( celsius + " grados celsius es igual a " + resultado + " grados fahrenheit");

    }
}
