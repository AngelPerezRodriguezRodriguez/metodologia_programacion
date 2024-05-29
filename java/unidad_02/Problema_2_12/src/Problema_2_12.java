import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, calcula lo que hay que pagarle a un trabajador teniendo en cuenta su
 * sueldo, horas extras y su categoría.
 */

public class Problema_2_12 {

    public static int obtenerPrecioHorasExtra(int categoria) {

        switch (categoria) {

            case 1:

                return 30;

            case 2:

                return 38;

            case 3:

                return 50;

            case 4:

                return 70;

            default:

                return 0;
        }
    }

    public static float calcularNuevoSueldo(float sueldo, int horasExtra, int precioHorasExtra) {

        if (horasExtra > 30) {

            return sueldo + 30 * precioHorasExtra;
        }
        return sueldo + horasExtra * precioHorasExtra;
    }

    public static void main(String[] args) {

        float sueldo;

        int categoria, horasExtra;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Sueldo: ");
            sueldo = scanner.nextFloat();

            if (sueldo <= 0) {

                System.out.println("Error: el sueldo debe ser mayor que cero.");
                return;
            }
            System.out.print("Categoría: ");
            categoria = scanner.nextInt();

            System.out.print("Horas extra: ");
            horasExtra = scanner.nextInt();

            if (horasExtra < 0) {

                System.out.println("Error: las horas extra debe ser mayor o igual a cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        int precioHorasExtra = obtenerPrecioHorasExtra(categoria);

        float nuevoSueldo = calcularNuevoSueldo(sueldo, horasExtra, precioHorasExtra);

        System.out.printf("El sueldo total es de %.2f u", nuevoSueldo);
    }
}