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

    public static float convertirGalones(float galones) {

        float litros = galones * 3.785f;
        // Un galón es igual a 3.785 litros

        return litros;
    }

    public static float calcularTotal(float litros, float precioGasolina) {

        float total = litros * precioGasolina;

        return total;
    }

    public static void main(String[] args) {

        float galones;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Es una buena práctica cerrar los recursos adecuadamente después de usarlos
             * para liberar cualquier recurso asociado, como archivos abiertos, conexiones
             * de red o lectores de entrada.
             */

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
        float litros = convertirGalones(galones);

        float precioGasolina = 8.2f;

        float total = calcularTotal(litros, precioGasolina);

        System.out.printf("%.2f galon(es) equivale(n) a %.2f litro(s). %n", galones, litros);

        System.out.printf("Si el litro de gasolina cuesta %s pesos, entonces %n", precioGasolina);

        System.out.printf("el costo total es de %.2f pesos", total);
    }
}