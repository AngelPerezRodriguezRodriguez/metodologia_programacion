import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa calcula la suma de una serie.
 */

public class Problema_3_09 {

    public static void main(String[] args) {

        int numero;

        int serie = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero < 1) {

                System.out.println("Error: el número debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        for (int i = 1; i <= numero; i++) {

            serie += Math.pow(i, i);
        }
        System.out.println("De acuerdo a la serie: (1 ^ 1) + (2 ^ 2) + (3 ^ 3) + ... + (n ^ n)");

        System.out.printf("El resultado es: %d", serie);
    }
}