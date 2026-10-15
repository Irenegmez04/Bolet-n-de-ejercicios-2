import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu peso en Kg: ");
        double peso = input.nextDouble();

        System.out.println("Introduce tu altura en cm: ");
        double altura = input.nextDouble();

        double BMI = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es: " + BMI);

        input.close();


    }
}
