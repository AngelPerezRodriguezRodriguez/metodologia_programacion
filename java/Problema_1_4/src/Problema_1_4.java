import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado como dato los galones surtidos a un
 * cliente en una gasolinera, calcula lo que el mismo debe
 * pagar.
 *
 * @author Angel P.
 * 
 */

public class Problema_1_4 {

    public static float convertir_galones(float galones) {

        float litros = galones * 3.785f;
        // Un galón es igual a 3.785 litros

        return litros;
    }

    public static float calcular_total(float litros, float precio_gasolina) {

        float total = litros * precio_gasolina;

        return total;
    }

    public static void main(String[] args) {

        float galones;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Galones de gasolina: ");
            galones = scanner.nextFloat();

            if (galones <= 0) {

                System.out.println("Error: el galón debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }

        float litros = convertir_galones(galones);

        float precio_gasolina = 8.2f;

        float total = calcular_total(litros, precio_gasolina);

        System.out.printf("%.2f galon(es) equivale(n) a %.2f litro(s). \n", galones, litros);

        System.out.printf("Si el litro de gasolina cuesta %s pesos, entonces \n", precio_gasolina);

        System.out.printf("el costo total es de %.2f pesos", total);
    }
}
