import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado como datos dos valores enteros, determina si los
 * mismo satisfacen una expresión.
 *
 * @author Angel P.
 * 
 */

public class Problema_2_2 {

    public static int calcularExpresion(int numero01, int numero02) {

        return (int) Math.pow(numero01, 3) + (int) Math.pow(numero02, 4) - 2 * (int) Math.pow(numero01, 2);
        // Expresión que contempla ambos números de entrada
    }

    public static void main(String[] args) {

        int numero01, numero02;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1er número: ");
            numero01 = scanner.nextInt();

            System.out.println("2do número: ");
            numero02 = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Error: por favor, ingresa números enteros.");
            return;
        }
        int resultado = calcularExpresion(numero01, numero02);

        boolean condicion = resultado < 680;

        String mensaje = (condicion) ? "cumplen" : "no cumplen";

        String simbolo = (condicion) ? "<" : ">";

        System.out.printf("P = %d y Q = %d %s con la condición %n", numero01, numero02, mensaje);

        System.out.println("P ** 3 + Q ** 4 - 2 * P ** 2 < 680");

        System.out.printf("%d %s 680", resultado, simbolo);
    }
}