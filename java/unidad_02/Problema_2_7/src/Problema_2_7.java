import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * 
 * El programa, dados como datos tres números enteros, determina si
 * los mismos están en orden creciente.
 *
 * @author Angel P.
 * 
 */

public class Problema_2_7 {

    public static boolean ascendente(int[] numeros, int dimension) {

        for (int i = 0; i < dimension - 1; i++) {

            if (numeros[i] > numeros[i + 1]) {

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
        boolean sentencia = ascendente(numeros, dimension);

        if (!sentencia) {

            System.out.println("La lista de números no es ascendente");
            return;
        }
        System.out.println("La lista de números es ascendente");
    }
}