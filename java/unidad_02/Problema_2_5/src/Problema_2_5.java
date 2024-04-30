import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado como dato un número entero, determina si el
 * mismo es positivo, negativo o nulo.
 *
 * @author Angel P.
 * 
 */

public class Problema_2_5 {

    public static void main(String[] args) {

        int numero;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número entero: ");
            numero = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        if (numero < 0) {

            System.out.printf("%s es un número negativo", numero);
            return;
        }
        if (numero > 0) {

            System.out.printf("%s es un número positivo", numero);
            return;
        }
        System.out.printf("%s es un número natural dependiendo %n", numero);

        System.out.println("del contexto o corriente de pensamiento");
    }
}