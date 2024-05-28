import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dados como datos la edad del paciente, el tipo de enfermedad
 * padecida y el número de días hospitalizados, calcula el costo total por
 * internación.
 */

public class Problema_2_14 {

    public static void calcularCosto(int enfermedad, int dias, int edad) {

        float costoTotal;

        switch (enfermedad) {

            case 1:

                costoTotal = dias * 25;
                break;

            case 2:

                costoTotal = dias * 16;
                break;

            case 3:

                costoTotal = dias * 20;
                break;

            case 4:

                costoTotal = dias * 32;
                break;

            default:

                System.out.println("Número de enfermedad no válido.");
                return;
        }
        if (edad >= 14 && edad <= 22) {

            costoTotal *= 1.1;
        }
        System.out.printf("El costo total por los servicios del hospital es de %.2f", costoTotal);
    }

    public static void main(String[] args) {

        int enfermedad, edad, dias;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Tipo de enfermedad: ");
            enfermedad = scanner.nextInt();

            System.out.print("Edad del paciente: ");
            edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {

                System.out.println("Error: la edad debe estar entre 0 y 120.");
                return;
            }
            System.out.print("Días hospitalizado: ");
            dias = scanner.nextInt();

            if (dias < 1) {

                System.out.println("Error: el registro de días debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        calcularCosto(enfermedad, dias, edad);
    }
}