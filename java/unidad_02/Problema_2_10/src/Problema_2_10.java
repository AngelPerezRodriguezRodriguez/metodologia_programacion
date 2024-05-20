import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dados como datos tres números cuyos valores pueden ser iguales,
 * determina cuál es el mayor o los mayores.
 */

public class Problema_2_10 {

    public static void encontrarMayor(int numero01, int numero02, int numero03) {

        if (numero01 > numero02) {

            if (numero01 > numero03) {

                System.out.printf("a:%d es el mayor", numero01);

            } else if (numero01 == numero03) {

                System.out.printf("a:%d y c:%d son los mayores", numero01, numero03);

            } else {

                System.out.printf("c:%d es el mayor", numero03);
            }

        } else if (numero01 == numero02) {

            if (numero01 > numero03) {

                System.out.printf("a:%d y b:%d son los mayores", numero01, numero02);

            } else if (numero01 == numero03) {

                System.out.printf("a:%d, b:%d y c:%d son iguales", numero01, numero02, numero03);

            } else {

                System.out.printf("c:%d es el mayor", numero03);
            }

        } else if (numero02 > numero03) {

            System.out.printf("b:%d es el mayor", numero02);

        } else if (numero02 == numero03) {

            System.out.printf("b:%d y c:%d son los mayores", numero02, numero03);

        } else {

            System.out.printf("c:%d es el mayor", numero03);
        }
    }

    public static void main(String[] args) {

        int numero01, numero02, numero03;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("número a: ");
            numero01 = scanner.nextInt();

            System.out.print("número b: ");
            numero02 = scanner.nextInt();

            System.out.print("número c: ");
            numero03 = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        encontrarMayor(numero01, numero02, numero03);
    }
}