import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * El programa, dados como datos tres números enteros, determina si
 * los mismos están en orden creciente.
 */

public class Problema_2_07 {

    public static boolean determinarAscendencia(int[] numeros, int dimension) {

        for (int i = 0; i < dimension - 1; i++) {
            // Toma los valores entre [0, dimension - 1)

            if (numeros[i] > numeros[i + 1]) {
                // La lista de números no es ascendente 
                // si un número es mayor que el siguiente en la lista

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int dimension = 3;

        int[] numeros = new int[dimension];

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < dimension; i++) {

                System.out.printf("Número %d: ", i + 1);
                numeros[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        boolean sentencia = determinarAscendencia(numeros, dimension);

        String mensaje = (sentencia) ? "es ascendnete" : "no es ascendente";

        System.out.printf("La lista de números %s", mensaje);
    }
}