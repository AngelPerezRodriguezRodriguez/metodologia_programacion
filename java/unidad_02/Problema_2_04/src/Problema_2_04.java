import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado como datos la matrícula y calificaciones de un alumno; imprime
 * la matrícula, el promedio y "aprobado" o "no aprobado", dependiendo si su
 * promedio fue mayor o igual que 6 o menor que 6, respectivamente.
 */

public class Problema_2_04 {

    public static float promediarCalificaciones(float[] calificaciones) {

        float sumaCalificaciones = 0;

        for (float calificacion : calificaciones) {
            // Bucle for each

            sumaCalificaciones += calificacion;
            // Suma de calificaciones
        }
        return sumaCalificaciones / 5;
        // Promedio de calificaciones
    }

    public static void main(String[] args) {

        int matricula;

        float[] calificaciones = new float[5];

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Matrícula: ");
            matricula = scanner.nextInt();

            for (int i = 0; i < 5; i++) {
                // Toma los valores entre [0, 5)

                System.out.printf("Calificación %d: ", i + 1);
                float calificacion = scanner.nextFloat();

                if (calificacion < 0 || calificacion > 10) {

                    System.out.println("Error: la calificación debe ser entre cero y diez.");
                    return;
                }
                calificaciones[i] = calificacion;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        float promedio = promediarCalificaciones(calificaciones);

        String texto = (promedio >= 6) ? "aprueba" : "no aprueba";

        System.out.printf("El alumno con matrícula %d %n", matricula);

        System.out.printf("promedia sus calificaciones con %.2f %n", promedio);

        System.out.printf("por lo tanto, %s el curso", texto);
    }
}