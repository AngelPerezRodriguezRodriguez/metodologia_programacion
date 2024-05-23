import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema_2_13 {

    public static void pertenecerFacultad(String carrera, int semestre, float promedio, int matricula) {

        String estado;

        switch (carrera.toLowerCase()) {

            case "economia":

                if (semestre >= 6 && promedio >= 8.8) {

                    estado = "aceptado";
                    break;
                }
                estado = "rechazado"; 
                break;

            case "computacion":

                if (semestre > 6 && promedio > 8.5) {

                    estado = "aceptado";
                    break;
                }
                estado = "rechazado"; 
                break;

            case "contabilidad":
            case "administracion":

                if (semestre > 5 && promedio > 8.5) {

                    estado = "Aceptado";
                    break;
                }
                estado = "rechazado"; 
                break;
                
            default:

                System.out.println("Nombre de carrera no válido.");
                System.out.println("El nombre no debe contener acentos");
                return;
        }
        System.out.printf("El alumno con matrícula %d %n", matricula);
        System.out.printf("fue %s de la carrera %s", estado, carrera);
    }

    public static void main(String[] args) {

        int matricula, semestre;

        String carrera;

        float promedio;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Matrícula: ");
            matricula = scanner.nextInt();

            scanner.nextLine();

            if (Integer.toString(matricula).length() != 5) {

                System.out.println("Error: la matrícula debe ser positiva y de cinco dígitos.");
                return;
            }
            System.out.print("Carrera: ");
            carrera = scanner.nextLine();

            System.out.print("Semestre: ");
            semestre = scanner.nextInt();

            if (semestre < 1 || semestre > 12) {

                System.out.println("Error: el semestre debe estar entre 1 y 12.");
                return;
            }

            System.out.print("Promedio: ");
            promedio = scanner.nextFloat();

            if (promedio < 5 || promedio > 10) {

                System.out.println("Error: el promedio debe estar entre 5 y 10.");
                return;
            }
        } catch (InputMismatchException e) {

            System.out.println(e);
            return;
        }
        pertenecerFacultad(carrera, semestre, promedio, matricula);
    }
}
