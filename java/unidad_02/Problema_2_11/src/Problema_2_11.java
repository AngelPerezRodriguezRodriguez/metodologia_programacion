import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dados como dato la clave de la zona a la cual se llamó y el
 * número de minutos que duró la llamada, calcula el costo total de la misma.
 */

public class Problema_2_11 {

    public static float calcularCosto(int clave, int minutos) {

        float costo = 0;

        switch (clave) {

            case 12:

                costo = minutos * 2;

            case 15:

                costo = minutos * (float) 2.2;

            case 18:

                costo = minutos * (float) 4.5;

            case 19:

                costo = minutos * (float) 3.5;

            case 23:
            case 25:

                costo = minutos * 6;

            case 29:

                costo = minutos * 5;

            default:

                System.out.println("Error: clave no válida.");
        }
        return costo;
    }

    public static void main(String[] args) {

        int clave, minutos;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Clave telefónica: ");
            clave = scanner.nextInt();

            System.out.print("Duración de la llamada (min): ");
            minutos = scanner.nextInt();

            if (minutos <= 0) {

                System.out.println("Error: la duración debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        float costo = calcularCosto(clave, minutos);

        if (costo != 0) {

            System.out.printf("El costo de llamada es de %.2f u", costo);
        }
    }
}