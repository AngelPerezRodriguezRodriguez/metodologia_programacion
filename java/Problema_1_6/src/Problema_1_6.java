import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado un número determinado de días, calcula
 * cuántos segundos tienen éstos.
 *
 * @author Angel P.
 * 
 */

public class Problema_1_6 {

    public static int calcular_segundos(int dias) {

        return dias * 60 * 60 * 24;
    }

    public static void main(String[] args) {

        int dias;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Días: ");
            dias = scanner.nextInt();

            if (dias <= 0) {

                System.out.println("Error: el número de días debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }

        int sengundos = calcular_segundos(dias);

        System.out.printf("%d días equivalen a %d segundos", dias, sengundos);
    }
}