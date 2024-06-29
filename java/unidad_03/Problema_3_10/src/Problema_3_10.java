/*
 * El programa calcula el término 180 de la secuencia Fibonacci.
 */

public class Problema_3_10 {

    public static void main(String[] args) {

        int primero = 0;
        int segundo = 1;

        int siguiente = 0;

        for (int i = 3; i <= 180; i++) {

            siguiente = primero + segundo;

            primero = segundo;
            segundo = siguiente;
        }
        System.out.println("El término 180 de la secuencia Fibonacci es:");

        System.out.println(siguiente);
    }
}