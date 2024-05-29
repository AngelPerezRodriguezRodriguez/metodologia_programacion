import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dado como datos el radio y la altura de un
 * cilindro, calcula su área y su volumen.
 */

public class Problema_1_05 {

    public static float calcularArea(float radio, float altura) {

        return 2 * (float) Math.PI * radio * altura;
        // Área de un cilindro
    }

    public static float calcularVolumen(float radio, float altura) {

        return (float) Math.PI * (float) Math.pow(radio, 2) * altura;
        // Volumen de un cilindro
    }

    public static void main(String[] args) {

        float radio, altura;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * Es una buena práctica cerrar los recursos adecuadamente después de usarlos
             * para liberar cualquier recurso asociado, como archivos abiertos, conexiones
             * de red o lectores de entrada.
             */

            System.out.print("Radio: ");
            radio = scanner.nextFloat();

            System.out.print("Altura: ");
            altura = scanner.nextFloat();

            if (radio <= 0 || altura <= 0) {

                System.out.println("Error: el radio y la altura deben ser mayores que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println(e);
            return;
        }
        float area = calcularArea(radio, altura);

        float volumen = calcularVolumen(radio, altura);

        System.out.printf("El área del cilindro es de %.2f u^2 y %n", area);

        System.out.printf("el volumen es de %.2f u^3", volumen);
    }
}