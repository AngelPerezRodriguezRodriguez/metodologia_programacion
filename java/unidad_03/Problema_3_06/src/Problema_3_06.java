import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa obtiene el mayor y menor de N números enteros que se ingresan.
 */

public class Problema_3_06 {

    public static void obtenerMayorMenor(int[] arregloDatos) {

        int numeroMayor;
        int numeroMenor;

        if (arregloDatos[0] > arregloDatos[1]) {

            numeroMayor = arregloDatos[0];
            numeroMenor = arregloDatos[1];

        } else {

            numeroMayor = arregloDatos[1];
            numeroMenor = arregloDatos[0];
        }
        for (int i = 2; i < arregloDatos.length; i++) {

            if (arregloDatos[i] > numeroMayor) {

                numeroMayor = arregloDatos[i];

            } else if (arregloDatos[i] < numeroMenor) {

                numeroMenor = arregloDatos[i];
            }
        }
        System.out.printf("Número mayor: %d %n", numeroMayor);

        System.out.printf("Número menor: %d %n", numeroMenor);
    }

    public static void main(String[] args) {

        int numeroDatos;
        int arregloDatos[];

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número de datos: ");
            numeroDatos = scanner.nextInt();

            if (numeroDatos < 2) {

                System.out.println("Error: el número de datos debe ser mayor que uno.");
                return;
            }
            arregloDatos = new int[numeroDatos];

            for (int i = 0; i < arregloDatos.length; i++) {

                System.out.printf("Dato %d: ", i + 1);
                arregloDatos[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        obtenerMayorMenor(arregloDatos);
    }
}