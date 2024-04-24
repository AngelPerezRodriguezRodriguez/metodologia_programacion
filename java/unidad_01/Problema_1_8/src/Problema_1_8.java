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

    public static float calcularDistancia(float x01, float y01, float x02, float y02) {

        return (float) Math.sqrt(Math.pow(x01 - x02, 2) + Math.pow(y01 - y02, 2));
        // Distancia entre dos puntos en un plano bidimensional
    }

    public static void main(String[] args) {

        float x01, y01, x02, y02;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Es una buena práctica cerrar los recursos adecuadamente después de usarlos
             * para liberar cualquier recurso asociado, como archivos abiertos, conexiones
             * de red o lectores de entrada.
             */

            System.out.println("x1: ");
            x01 = scanner.nextFloat();

            System.out.println("y1: ");
            y01 = scanner.nextFloat();

            System.out.println("x2: ");
            x02 = scanner.nextFloat();

            System.out.println("y2: ");
            y02 = scanner.nextFloat();

        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }
        float distancia = calcularDistancia(x01, y01, x02, y02);

        System.out.printf("La distancia entre A(%.2f, %.2f) y B(%.2f, %.2f) %n", x01, y01, x02, y02);

        System.out.printf("es igual a %.2f u", distancia);
    }
}