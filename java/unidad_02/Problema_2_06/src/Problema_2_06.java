import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado como dato un número entero, determina si el
 * mismo es par, impar o nulo.
 */

public class Problema_2_06 {

    public static void main(String[] args) {

        int numero;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número entero: ");
            numero = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        String mensaje = (Math.pow(-1, numero) > 0) ? "número par" : "número impar";
        // -1 elevado a un número par, es positivo
        // -1 elevado a un número impar, es negativo

        System.out.printf("%d es un %s", numero, mensaje);
    }
}