import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dados como dato la clave de la zona a la cual se llamó y el
 * número de minutos que duró la llamada, calcula el costo total de la misma.
 */

public class Problema_2_11 {

    public static void calcularCosto(int clave, int minutos) {

        float costo;

        switch (clave) {

            case 12:

                costo = minutos * 2;
                break;

            case 15:

                costo = minutos * (float) 2.2;
                break;

            case 18:

                costo = minutos * (float) 4.5;
                break;

            case 19:

                costo = minutos * (float) 3.5;
                break;

            case 23:
            case 25:

                costo = minutos * 6;
                break;

            case 29:

                costo = minutos * 5;
                break;

            default:

                System.out.println("Error: clave no válida.");
                return;
        }
        System.out.printf("El costo de llamada es de %.2f u", costo);
    }

    public static void main(String[] args) {

        int clave, minutos;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Clave telefónica: ");
            clave = scanner.nextInt();

            System.out.print("Duración de llamada (min): ");
            minutos = scanner.nextInt();

            if (minutos <= 0) {

                System.out.println("Error: la duración debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        calcularCosto(clave, minutos);
    }
}