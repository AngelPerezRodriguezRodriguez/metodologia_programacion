import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado como dato el número de sonidos emitidos por un
 * grillo en un minuto, calcula la temperatura en grados Fahrenheit.
 *
 * @author Angel P.
 * 
 */

public class Problema_2_1 {

    public static float calcularTemperatura(int noSonidos) {

        return (float) noSonidos / 4 + 40;
        // Función de temperatura en grados Fahrenheit
        // de acuerdo al no. de sonidos emitidos por un grillo en un minuto
    }

    public static void main(String[] args) {

        int noSonidos;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Sonidos por minuto de un grillo: ");
            noSonidos = scanner.nextInt();

            if (noSonidos <= 0) {

                System.out.println("Error: el no. de sonidos debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println("Error: por favor, ingresa un número entero.");
            return;
        }
        float temperatura = calcularTemperatura(noSonidos);

        System.out.println("La temperatura es igual a");

        System.out.printf("%.2f grados Fahrenheit", temperatura);
    }
}