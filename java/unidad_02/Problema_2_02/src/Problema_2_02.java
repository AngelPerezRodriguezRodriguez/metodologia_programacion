import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado como datos dos valores enteros, determina si los
 * mismo satisfacen una expresión.
 */

public class Problema_2_02 {

    public static int calcularExpresion(int numero01, int numero02) {

        return (int) Math.pow(numero01, 3) + (int) Math.pow(numero02, 4) - 2 * (int) Math.pow(numero01, 2);
        // Expresión que contempla ambos números de entrada
    }

    public static void main(String[] args) {

        int numero01, numero02;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("1er número: ");
            numero01 = scanner.nextInt();

            System.out.print("2do número: ");
            numero02 = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println(e);
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