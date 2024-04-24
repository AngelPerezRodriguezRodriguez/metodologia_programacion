import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado el nombre de un dinosaurio, su peso expresado en toneladas y
 * su longitud expresada en pies; escribe el nombre del dinosuario, su peso y longitud
 * expresadas en kilogramos y metros, respectivamente.
 *
 * @author Angel P.
 * 
 */

public class Problema_1_3 {

    public static float[] convertirUnidades(float peso, float longitud) {

        float pesoKilogramos = peso * 1000;
        // Una tonelada es igual a mil kilogramos

        float longitudMetros = longitud * 0.3047f;
        // Un pie es igual a 0.3047 metros

        return new float[] { pesoKilogramos, longitudMetros };
    }

    public static void main(String[] args) {

        String nombre;

        float peso, longitud;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Es una buena práctica cerrar los recursos adecuadamente después de usarlos
             * para liberar cualquier recurso asociado, como archivos abiertos, conexiones
             * de red o lectores de entrada.
             */

            System.out.println("Nombre del dinosaurio: ");
            nombre = scanner.nextLine();

            System.out.println("Peso en toneladas: ");
            peso = scanner.nextFloat();

            System.out.println("Longitud en pies: ");
            longitud = scanner.nextFloat();

            if (peso <= 0 || longitud <= 0) {

                System.out.println("Error: el peso y la longitud deben ser mayores que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }
        float[] unidades = convertirUnidades(peso, longitud);

        System.out.printf("El dinosaurio %s %n", nombre);

        System.out.printf("pesa %.2f kilogramos y %n", unidades[0]);

        System.out.printf("mide %.2f metros", unidades[1]);
    }
}