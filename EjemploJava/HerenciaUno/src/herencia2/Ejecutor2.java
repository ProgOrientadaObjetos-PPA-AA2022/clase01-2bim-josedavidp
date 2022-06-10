/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;

import herencia1.EstudianteDistancia;

/**
 *
 * @author josed
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
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
    }
}
