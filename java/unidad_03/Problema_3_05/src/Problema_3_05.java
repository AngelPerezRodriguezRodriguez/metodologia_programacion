import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa dado N números enteros como dato, obtiene el número de números
 * positivos, el promedio de los números positivos y el promedio de todos los
 * números.
 */

public class Problema_3_05 {

    public static void main(String[] args) {

        int numeroDatos;
        int numero;

        int numeroPositivos = 0;
        int sumaPositivos = 0;
        int sumaDatos = 0;

        float promedioPositivos;
        float promedioDatos;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número de datos: ");
            numeroDatos = scanner.nextInt();

            if (numeroDatos <= 0) {

                System.out.println("Error: el número de datos debe ser mayor que cero.");
                return;
            }
            for (int i = 0; i < numeroDatos; i++) {

                System.out.printf("Dato %d: ", i + 1);
                numero = scanner.nextInt();

                if (numero > 0) {

                    numeroPositivos++;
                    sumaPositivos += numero;
                }
                sumaDatos += numero;
            }
            promedioPositivos = (float) sumaPositivos / (float) numeroPositivos;

            promedioDatos = (float) sumaDatos / (float) numeroDatos;

            System.out.printf("Número de positivos: %d %n", numeroPositivos);

            System.out.printf("Promedio de positivos: %.2f %n", promedioPositivos);

            System.out.printf("Promedio de números: %.2f %n", promedioDatos);

        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
    }
}