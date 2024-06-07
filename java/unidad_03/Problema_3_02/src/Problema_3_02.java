/*
 * El programa imprime y suma los términos de una serie.
 */

public class Problema_3_02 {

    public static void main(String[] args) {

        int i = 2;

        int sumaSerie = 0;

        boolean varControl = true;

        while (i <= 1800) {

            sumaSerie += i;
            System.out.printf("Se suma el número: %d %n", i);

            if (varControl) {

                i += 3;
                System.out.printf("Total: %d %n %n", sumaSerie);

                varControl = false;
                continue;
            }
            i += 2;
            System.out.printf("Total: %d %n %n", sumaSerie);

            varControl = true;
        }
        System.out.printf("Total final: %d", sumaSerie);
    }
}