import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa calcula el resultado de una determinada serie.
 */

public class Problema_3_03 {

    public static float calcularSerie(int numero, float serie) {

        boolean varControl = true;

        for (int i = 1; i <= numero; i++) {

            if (varControl) {

                serie += 1.0 / i;
                varControl = false;

                System.out.printf("%.4f %n", serie);
                continue;
            }
            serie -= 1.0 / i;
            varControl = true;

            System.out.printf("%.4f %n", serie);
        }
        return serie;
    }

    public static void main(String[] args) {

        int numero;

        float serie = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número entero: ");
            numero = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        serie = calcularSerie(numero, serie);

        System.out.printf("Resultado de la serie: %.4f", serie);
    }
}