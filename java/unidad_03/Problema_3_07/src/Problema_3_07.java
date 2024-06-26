import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa dada información sobre las ventas que hizo un vendedor, obtiene
 * cuantas ventas fueron chicas, medianas y grandes.
 */

public class Problema_3_07 {

    public static void main(String[] args) {

        int numeroVentas;
        float venta;

        int noVentasChi = 0;
        int noVentasMed = 0;
        int noVentasGra = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Número de ventas: ");
            numeroVentas = scanner.nextInt();

            if (numeroVentas < 1) {

                System.out.println("Error: el número de ventas debe ser mayor que cero.");
                return;
            }
            for (int i = 0; i < numeroVentas; i++) {

                System.out.printf("Venta %d: ", i + 1);
                venta = scanner.nextFloat();

                if (venta <= 200) {

                    noVentasChi += 1;

                } else if (venta < 400) {

                    noVentasMed += 1;

                } else {

                    noVentasGra += 1;
                }
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        System.out.printf("Número de ventas chicas: %d %n", noVentasChi);

        System.out.printf("Número de ventas medianas: %d %n", noVentasMed);

        System.out.printf("Número de ventas grandes: %d %n", noVentasGra);
    }
}