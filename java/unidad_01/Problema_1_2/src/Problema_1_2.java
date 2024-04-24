import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dados como datos la base y la altura de un
 * triángulo, calcula su superficie.
 *
 * @author Angel P.
 * 
 */

public class Problema_1_2 {

    public static float calcularSuperficie(float base, float altura) {

        return base * altura / 2;
    }

    public static void main(String[] args) {

        float base, altura;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Es una buena práctica cerrar los recursos adecuadamente después de usarlos
             * para liberar cualquier recurso asociado, como archivos abiertos, conexiones
             * de red o lectores de entrada.
             */

            System.out.println("Base del triángulo: ");
            base = scanner.nextFloat();

            System.out.println("Altura del triángulo: ");
            altura = scanner.nextFloat();

            if (base <= 0 || altura <= 0) {

                System.out.println("Error: la altura y la base deben ser mayores que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }
        float area = calcularSuperficie(base, altura);

        System.out.printf("Área: %.2f", area);
    }
}