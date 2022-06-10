/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;
/**
 *
 * @author josed
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Objeto de tipo Estudiante Presencial
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("René Rolando");
        e1.establecerApellidoEstudiante("Elizalde Solano");
        e1.establecerIdentificacionEstudiante("1104805609");
        e1.establecerEdadEstudiante(38);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        
        
    }
}
