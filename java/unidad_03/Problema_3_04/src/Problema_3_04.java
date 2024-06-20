import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa, teniendo en cuenta ciertos criterios, calcula el aumento de sueldo
 * para un grupo de trabajadores. Imprime el nuevo sueldo del trabajador y la nómina
 * correspondiente.
 */

public class Problema_3_04 {

    public static float ingresarSueldo(int noEmpleado, Scanner scanner) {

        float sueldo;

        System.out.printf("Sueldo del trabajador %d: ", noEmpleado);
        sueldo = scanner.nextFloat();

        if (sueldo < -1) {

            System.out.println("Error: el sueldo debe ser mayor que cero.");
            return -1;
        }
        return sueldo;
    }

    public static void main(String[] args) {

        float sueldo;

        int noEmpleado = 1;

        float nuevoSueldo;

        float nomina = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            sueldo = ingresarSueldo(noEmpleado, scanner);

            while (sueldo != -1) {

                if (sueldo < 1000) {

                    nuevoSueldo = sueldo * (float) 1.15;

                } else {

                    nuevoSueldo = sueldo * (float) 1.12;
                }
                nomina += nuevoSueldo;

                System.out.printf("Nuevo sueldo: %.2f %n %n", nuevoSueldo);
                noEmpleado++;

                sueldo = ingresarSueldo(noEmpleado, scanner);
            }
            System.out.printf("Nómina de la empresa: %.2f", nomina);

        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
    }
}