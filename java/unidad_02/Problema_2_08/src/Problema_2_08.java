import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado como dato el monto de la compra de un cliente, determina lo
 * que el mismo debe pagar teniendo en cuenta una serie de descuentos.
 */

public class Problema_2_08 {

    public static float[] aplicarDescuento(float totalCompra) {

        float descuento, nuevoTotal;

        if (totalCompra < 500) {

            descuento = 0;

        } else if (totalCompra <= 1000) {

            descuento = (float) 0.05;

        } else if (totalCompra <= 7000) {

            descuento = (float) 0.11;

        } else if (totalCompra <= 15000) {

            descuento = (float) 0.18;

        } else {

            descuento = (float) 0.25;
        }
        nuevoTotal = totalCompra - totalCompra * descuento;

        return new float[] { descuento, nuevoTotal };
    }

    public static void main(String[] args) {

        float totalCompra;

        float[] valores;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Total de compra: ");
            totalCompra = scanner.nextFloat();

            if (totalCompra <= 0) {

                System.out.println("Error: el total de compra debe ser mayor que cero.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        valores = aplicarDescuento(totalCompra);

        System.out.printf("%.2f u tiene %.0f %% de descuento, %n", totalCompra, valores[0] * 100);

        System.out.printf("por lo tanto, el nuevo total es de %.2f u", valores[1]);
    }
}