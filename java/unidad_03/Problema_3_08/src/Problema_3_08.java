import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa, dado un entero positivo, obtiene e imprime la sucesión de ULAM.
 */

public class Problema_3_08 {

    public static void main(String[] args) {

        int numero;

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
        while (numero != 1) {

            System.out.println(numero);

            if (Math.pow(-1, numero) > 0) {

                numero /= 2;
                continue;
            }
            numero = numero * 3 + 1;
        }
        System.out.println(numero);
    }
}