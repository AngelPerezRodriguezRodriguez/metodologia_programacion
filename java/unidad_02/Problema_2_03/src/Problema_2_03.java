import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado como datos los coeficientes de la ecuación,
 * calcula las raíces reales (si existen).
 */

public class Problema_2_03 {

    public static float[] formulaGeneral(float coeficienteA, float coeficienteB, float discriminante) {
        // Fórmula general para resolver ecuaciones de segundo grado

        float x01 = (-coeficienteB + (float) Math.sqrt(discriminante)) / (2 * coeficienteA);
        // Primera solución

        float x02 = (-coeficienteB - (float) Math.sqrt(discriminante)) / (2 * coeficienteA);
        // Segunda solución

        return new float[] { x01, x02 };
    }

    public static void main(String[] args) {

        float coeficienteA, coeficienteB, coeficienteC;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Coeficiente a: ");
            coeficienteA = scanner.nextFloat();

            System.out.print("Coeficiente b: ");
            coeficienteB = scanner.nextFloat();

            System.out.print("Coeficiente c: ");
            coeficienteC = scanner.nextFloat();

            if (coeficienteA == 0) {

                System.out.println("Error: el primer coeficiente debe ser diferente de cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        float discriminante = (float) Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;

        if (discriminante < 0) {

            System.out.println("No es posible obtener las raíces reales de la ecuación de segundo grado.");
            return;
        }

        float[] soluciones = formulaGeneral(coeficienteA, coeficienteB, discriminante);

        System.out.println("Las raíces reales de la expresión (a * x) ** 2 + (b * x) + c = 0");

        System.out.printf("siendo a = %.2f, b = %.2f y c = %.2f %n", coeficienteA, coeficienteB, coeficienteC);

        System.out.printf("son %.2f y %.2f", soluciones[0], soluciones[1]);
    }
}