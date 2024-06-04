import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa, dados 270 números enteros, obtiene la suma de los números
 * impares y el promedio de los números pares.
 */

public class Problema_3_01 {

    public static void main(String[] args) {

        int numero, sumaPares = 0, noPares = 0;

        int sumaImpares = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < 270; i++) {

                System.out.printf("Número %d: ", i + 1);
                numero = scanner.nextInt();

                if (numero == 0) {
                    continue;
                }

                if (Math.pow(-1, numero) > 0) {
                    // -1 elevado a un número par, es positivo

                    sumaPares += numero;
                    noPares++;

                } else {
                    // -1 elevado a un número impar, es negativo

                    sumaImpares += numero;
                }
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        // El promedio de 'n' números pares siempre es un número entero
        int promedioPares = sumaPares / noPares;

        System.out.printf("Números pares (promedio): %d %n", promedioPares);

        System.out.printf("Números impares (suma): %d %n", sumaImpares);
    }
}