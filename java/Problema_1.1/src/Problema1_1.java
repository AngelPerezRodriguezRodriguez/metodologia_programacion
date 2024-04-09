import java.util.Scanner;

/*
 * 
 * El programa, dado el costo de un producto y la cantidad de dinero entregada
 * por el cliente, calcula el vuelto que hay que entregarle al mismo.
 *
 * @author Angel P.
 * 
 */

public class Problema1_1 {

     public static float calcular_cambio(float pagoRecibido, float precioProducto) {

          return pagoRecibido - precioProducto;
     }

     public static void main(String[] args) {

          try (Scanner scanner = new Scanner(System.in)) {

               System.out.print("Costo del producto: ");
               float precioProducto = scanner.nextFloat();

               System.out.print("Dinero recibido: ");
               float pagoRecibido = scanner.nextFloat();

               float cambio = calcular_cambio(pagoRecibido, precioProducto);

               System.out.printf("Cambio: %.2f ", cambio);

          } catch (Exception e) {

               System.out.println("Error: por favor, ingresa un valor válido.");
          }
     }
}
