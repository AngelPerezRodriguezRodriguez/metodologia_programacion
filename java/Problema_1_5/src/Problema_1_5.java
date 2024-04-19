import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dado como datos el radio y la altura de un
 * cilindro, calcula su área y su volumen.
 *
 * @author Angel P.
 * 
 */

public class Problema_1_5 {

    public static float calcular_area(float radio, float altura) {

        return 2 * (float) Math.PI * radio * altura;
        // Área de un cilindro
    }

    public static float calcular_volumen(float radio, float altura) {

        return (float) Math.PI * (float) Math.pow(radio, 2) * altura;
        // Volumen de un cilindro
    }

    public static void main(String[] args) {

        float radio, altura;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Radio: ");
            radio = scanner.nextFloat();

            System.out.println("Altura: ");
            altura = scanner.nextFloat();

            if (radio <= 0 || altura <= 0) {

                System.out.println("Error: el radio y la altura deben ser mayores que cero.");
                return;
            }
        } catch (InputMismatchException e) {
            // Se produce cuando el tipo de dato ingresado por el usuario no coincide con el
            // esperado.

            System.out.println("Error: por favor, ingresa un valor válido.");
            return;
        }

        float area = calcular_area(radio, altura);

        float volumen = calcular_volumen(radio, altura);

        System.out.printf("El área del cilindro es de %.2f u^2 y \n", area);

        System.out.printf("el volumen es de %.2f u^3", volumen);
    }
}