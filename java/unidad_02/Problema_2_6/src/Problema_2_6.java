import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado como dato un número entero, determina si el
 * mismo es par, impar o nulo.
 *
 * @author Angel P.
 * 
 */

public class Problema_2_6 {

    public static void main(String[] args) {

        int numero;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número entero: ");
            numero = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        if (Math.pow(-1, numero) > 0) {

            System.out.printf("%s es un número par", numero);
            // -1 elevado a un número par, es positivo
            return;
        }
        System.out.printf("%s es un número impar", numero);
        // -1 elevado a un número impar, es negativo
    }
}