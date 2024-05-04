import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado como dato el monto de la compra de un cliente, determina lo
 * que el mismo debe pagar teniendo en cuenta una serie de descuentos.
 *
 * @author Angel P.
 * 
 */

public class Problema_2_9 {

    public static float aplicarImpuesto(float precio) {

        float impuesto;

        if (precio <= 20) {

            impuesto = 0;

        } else if (precio <= 40) {

            impuesto = (precio - 20) * (float) 0.3;

        } else if (precio <= 500) {

            impuesto = 20 * (float) 0.3 + (precio - 40) * (float) 0.4;

        } else {

            impuesto = 20 * (float) 0.3 + (precio - 40) * (float) 0.5;
        }
        float nuevoPrecio = precio + impuesto;

        return nuevoPrecio;
    }

    public static void main(String[] args) {

        float precio;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Precio del artículo: ");
            precio = scanner.nextFloat();

            if (precio <= 0) {

                System.out.println("Error: el precio debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        float nuevoPrecio = aplicarImpuesto(precio);

        System.out.println("El precio del artículo más impuestos");

        System.out.printf("da un total de %.2f u", nuevoPrecio);
    }
}