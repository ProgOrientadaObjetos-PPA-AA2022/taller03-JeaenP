/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author SALA I
 */
public class Terreno {

    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;
    
    public void establecerAncho(double x) {
        ancho = x;
    }
    
    public void establecerLargo(double x) {
        largo = x;
    }
    
    public void establecerValorMetroCuadrado(double x) {
        valorMetroCuadrado = x;
    }
    
    public void calcularArea() {
        area = ancho * largo;
    }
    
    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }
    
    
    public double obtenerAncho() {
        return ancho ;
    }
    
    public double obtenerLargo() {
        return largo ;
    }
    
    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado ;
    }
    
    public double obtenerArea() {
        return area ;
    }
    
    public double obtenerCostoTerreno() {
        return costoTerreno;
    }
    
}
