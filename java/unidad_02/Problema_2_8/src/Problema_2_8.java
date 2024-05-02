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

public class Problema_2_8 {

    public static float[] aplicarDescuento(float total_compra) {

        float descuento, nuevo_total;

        if (total_compra < 500) {

            descuento = 0;

            nuevo_total = total_compra;

        } else if (total_compra <= 1000) {

            descuento = (float) 0.05;

            nuevo_total = total_compra - total_compra * descuento;

        } else if (total_compra <= 7000) {

            descuento = (float) 0.11;

            nuevo_total = total_compra - total_compra * descuento;

        } else if (total_compra <= 15000) {

            descuento = (float) 0.18;

            nuevo_total = total_compra - total_compra * descuento;

        } else {

            descuento = (float) 0.25;

            nuevo_total = total_compra - total_compra * descuento;
        }
        return new float[] { descuento, nuevo_total };
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