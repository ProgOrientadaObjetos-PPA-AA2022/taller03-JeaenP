/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;
import paquete002.InstitucionEducativa;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstitucionEducativa laSalle = new InstitucionEducativa();
        InstitucionEducativa comil = new InstitucionEducativa();
        
        
        laSalle.establecerNombre("La Salle");
        laSalle.establecerTipoInstitucion("Particular");
        laSalle.establecerNumAlumnos(600);
        laSalle.establecerDocentes(50);
        laSalle.establecerDeCedes(150);
        laSalle.establecerGastos(100);
        laSalle.calcularPresupuesto();
        
        comil.establecerNombre("COMIL");
        comil.establecerTipoInstitucion("Fiscal");
        comil.establecerNumAlumnos(1000);
        comil.establecerDocentes(100);
        comil.establecerDeCedes(1);
        comil.establecerGastos(50);
        comil.calcularPresupuesto();
        
        
        System.out.printf("Institucion Educativa 1\n\nNombre: %s\n"
                + "Tipo de Institucion: %s\nNumero de Alumnos: %d\n"
                + "Numero de Docentes: %d\n" 
                + "Numero de Cedes: %d\n" 
                + "Gastos por Estudiante: %.2f\n"
                + "Presupuesto: %.2f\n",
                laSalle.obtenerNombre(),
                laSalle.obtenerTipoInstitucion(),
                laSalle.obtenerNumAlumnos(), 
                laSalle.obtenerDocentes(),
                laSalle.obtenerDeCedes(),
                laSalle.obtenerGastos(),
                laSalle.obtenerPresupuesto());
        
        System.out.printf("\nInstitucion Educativa 1\n\nNombre: %s\n"
                + "Tipo de Institucion: %s\nNumero de Alumnos: %d\n"
                + "Numero de Docentes: %d\n" 
                + "Numero de Cedes: %d\n" 
                + "Gastos por Estudiante: %.2f\n"
                + "Presupuesto: %.2f\n",
                comil.obtenerNombre(),
                comil.obtenerTipoInstitucion(),
                comil.obtenerNumAlumnos(), 
                comil.obtenerDocentes(),
                comil.obtenerDeCedes(),
                comil.obtenerGastos(),
                comil.obtenerPresupuesto());
    }
}
