import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dados los tres lados de un triángulo, calcula su
 * área.
 *
 * @author Angel P.
 * 
 */

public class Problema_1_7 {

    public static float calcularArea(float lado01, float lado02, float lado03) {

        double s = (lado01 + lado02 + lado03) / 2;
        // Variable auxiliar

        return (float) Math.sqrt(s * (s - lado01) * (s - lado02) * (s - lado03));
        // Área de un triángulo
    }

    public static void main(String[] args) {

        float lado01, lado02, lado03;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1er lado: ");
            lado01 = scanner.nextFloat();

            System.out.println("2do lado: ");
            lado02 = scanner.nextFloat();

            System.out.println("3er lado: ");
            lado03 = scanner.nextFloat();

            if (lado01 <= 0 || lado02 <= 0 || lado03 <= 0) {

                System.out.println("Error: los lados deben ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }
        float area = calcularArea(lado01, lado02, lado03);

        System.out.printf("El área del triángulo es igual a %.4f u^2", area);
    }
}
