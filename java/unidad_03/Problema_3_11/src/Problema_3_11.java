import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * El programa, obtiene el total de votos y el porcentaje obtenido por los cuatro
 * candidatos de una elección.
 */

public class Problema_3_11 {

    public static void main(String[] args) {

        int voto;

        int votosCandidato01 = 0;
        int votosCandidato02 = 0;
        int votosCandidato03 = 0;
        int votosCandidato04 = 0;

        float totalVotos;

        float porcentajeCandidato01;
        float porcentajeCandidato02;
        float porcentajeCandidato03;
        float porcentajeCandidato04;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Voto: ");
            voto = scanner.nextInt();

            while (voto != 0) {

                switch (voto) {

                    case 1:

                        votosCandidato01 += 1;
                        break;

                    case 2:

                        votosCandidato02 += 1;
                        break;

                    case 3:

                        votosCandidato03 += 1;
                        break;

                    case 4:

                        votosCandidato04 += 1;
                        break;

                    default:

                        System.out.println("Error: voto no válido.");
                        break;
                }
                System.out.print("Voto: ");
                voto = scanner.nextInt();
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        totalVotos = votosCandidato01 + votosCandidato02 + votosCandidato03 + votosCandidato04;

        porcentajeCandidato01 = (votosCandidato01 / totalVotos) * 100;
        porcentajeCandidato02 = (votosCandidato02 / totalVotos) * 100;
        porcentajeCandidato03 = (votosCandidato03 / totalVotos) * 100;
        porcentajeCandidato04 = (votosCandidato04 / totalVotos) * 100;

        System.out.printf("Votos candidato 01: %d %nPorcentaje: %.2f %n", votosCandidato01, porcentajeCandidato01);
        System.out.printf("Votos candidato 02: %d %nPorcentaje: %.2f %n", votosCandidato02, porcentajeCandidato02);
        System.out.printf("Votos candidato 03: %d %nPorcentaje: %.2f %n", votosCandidato03, porcentajeCandidato03);
        System.out.printf("Votos candidato 04: %d %nPorcentaje: %.2f %n", votosCandidato04, porcentajeCandidato04);

        System.out.printf("Total de votos: %.0f", totalVotos);
    }
}