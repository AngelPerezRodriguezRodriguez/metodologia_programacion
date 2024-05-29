import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado el costo de un producto y la cantidad de dinero entregada
 * por el cliente, calcula el vuelto que hay que entregarle al mismo.
 */

public class Problema_1_01 {

    public static float calcularCambio(float pagoRecibido, float precioProducto) {

        return pagoRecibido - precioProducto;
    }

    public static void main(String[] args) {

        float precioProducto, pagoRecibido;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Es una buena práctica cerrar los recursos adecuadamente después de usarlos
             * para liberar cualquier recurso asociado, como archivos abiertos, conexiones
             * de red o lectores de entrada.
             */

            System.out.print("Costo del producto: ");
            precioProducto = scanner.nextFloat();

            System.out.print("Dinero recibido: ");
            pagoRecibido = scanner.nextFloat();

            if (precioProducto <= 0 || pagoRecibido <= 0) {

                System.out.println("Error: el precio y el pago deben ser mayores que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println(e);
            return;
        }
        float cambio = calcularCambio(pagoRecibido, precioProducto);

        System.out.printf("Cambio: %.2f ", cambio);
    }
}