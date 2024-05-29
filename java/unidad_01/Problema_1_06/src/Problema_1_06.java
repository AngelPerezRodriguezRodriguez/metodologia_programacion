import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado un número determinado de días, calcula
 * cuántos segundos tienen éstos.
 */

public class Problema_1_06 {

    public static int calcularSegundos(int dias) {

        return dias * 60 * 60 * 24;
    }

    public static void main(String[] args) {

        int dias;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Es una buena práctica cerrar los recursos adecuadamente después de usarlos
             * para liberar cualquier recurso asociado, como archivos abiertos, conexiones
             * de red o lectores de entrada.
             */

            System.out.print("Días: ");
            dias = scanner.nextInt();

            if (dias <= 0) {

                System.out.println("Error: el número de días debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println(e);
            return;
        }
        int segundos = calcularSegundos(dias);

        System.out.printf("%d días equivalen a %d segundos", dias, segundos);
    }
}