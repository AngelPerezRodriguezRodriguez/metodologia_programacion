import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dadas las coordenadas de dos puntos P1 y P2
 * calcula la distancia entre estos puntos.
 *
 * @author Angel P.
 * 
 */

public class Problema_1_8 {

    public static float calcularDistancia(float x1, float y1, float x2, float y2) {

        return (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        // Distancia entre dos puntos en un plano bidimensional
    }

    public static void main(String[] args) {

        float x1, y1, x2, y2;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("x1: ");
            x1 = scanner.nextFloat();

            System.out.println("y1: ");
            y1 = scanner.nextFloat();

            System.out.println("x2: ");
            x2 = scanner.nextFloat();

            System.out.println("y2: ");
            y2 = scanner.nextFloat();

        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }
        float distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.printf("La distancia entre A(%.2f, %.2f) y B(%.2f, %.2f) %n", x1, y1, x2, y2);

        System.out.printf("es igual a %.2f u", distancia);
    }
}
