/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author SALA I
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroDeCedes;
    private double gastosPorEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerTipoInstitucion(String x) {
        tipoInstitucion = x;
    }
    
    public void establecerNumAlumnos(int x) {
        numeroAlumnos = x;
    }
    
    public void establecerDocentes(int x) {
        numeroDocentes = x;
    }
    
    public void establecerDeCedes(int x) {
        numeroDeCedes = x;
    }
    
    public void establecerGastos(double x) {
        gastosPorEstudiante = x;
    }
    
    public void calcularPresupuesto() {
        presupuesto = gastosPorEstudiante * numeroAlumnos;
    }
    
    public String obtenerNombre() {
        return nombre ;
    }
    
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    
    public int obtenerNumAlumnos() {
        return numeroAlumnos ;
    }
    
    public int obtenerDocentes() {
        return numeroDocentes;
    }
    
    public int obtenerDeCedes() {
        return numeroDeCedes;
    }
    
    public double obtenerGastos() {
        return gastosPorEstudiante;
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
    }
    
}
