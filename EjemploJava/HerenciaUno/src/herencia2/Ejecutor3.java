/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author josed
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese [1] para estudiante distancia o [2] para estudiante presencial");
        int opcion = entrada.nextInt();
        if (opcion != 1 && opcion != 2) {
            System.out.println("Opción inválida");
        } else {
            System.out.println("Ingrese nombres");
            entrada.nextLine();
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese número de asignaturas");
                int numeroAsignaturas = entrada.nextInt();
                System.out.println("Ingrese costo de asignatura");
                double costoAsignatura = entrada.nextDouble();

                EstudianteDistancia e1 = new EstudianteDistancia();
                e1.establecerNombresEstudiante(nombres);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(identificacion);
                e1.establecerEdadEstudiante(edad);
                e1.establecerNumeroAsginaturas(numeroAsignaturas);
                e1.establecerCostoAsignatura(costoAsignatura);
                e1.calcularMatriculaDistancia();

                System.out.printf("%s\n", e1);

            } else if (opcion == 2) {
                System.out.println("Ingrese número de créditos");
                int numeroCreditos = entrada.nextInt();
                System.out.println("Ingrese costo de crédito");
                double costoCredito = entrada.nextDouble();

                EstudiantePresencial e1 = new EstudiantePresencial();
                e1.establecerNombresEstudiante(nombres);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(identificacion);
                e1.establecerEdadEstudiante(edad);
                e1.establecerNumeroCreditos(numeroCreditos);
                e1.establecerCostoCredito(costoCredito);
                e1.calcularMatriculaPresencial();

                System.out.printf("%s\n", e1);
            }
        }
    }
}
