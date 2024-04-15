import java.util.Scanner;
import java.util.InputMismatchException;

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

          float precioProducto;
          float pagoRecibido;

          try (Scanner scanner = new Scanner(System.in)) {

               System.out.print("Costo del producto: ");
               precioProducto = scanner.nextFloat();

               System.out.print("Dinero recibido: ");
               pagoRecibido = scanner.nextFloat();

               if (precioProducto <= 0 || pagoRecibido <= 0) {

                    System.out.println("Error: el precio y el pago deben ser mayor a cero.");
                    return;
               }
          } catch (InputMismatchException e) {
               // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
               // esperado.

               System.out.println("Error: por favor, ingresa un valor válido.");
               return;
          }
          float cambio = calcular_cambio(pagoRecibido, precioProducto);

          System.out.printf("Cambio: %.2f ", cambio);
     }
}