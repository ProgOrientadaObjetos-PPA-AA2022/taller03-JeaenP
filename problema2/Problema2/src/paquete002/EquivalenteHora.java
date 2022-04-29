/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author SALA I
 */
public class EquivalenteHora {
    double horas;
    double minutos;
    double segundos;
    double dias;
    
    public void establcerHora(double x) {
        horas = x;
    }
    
    public void calcularMinutos() {
        minutos = horas * 60;
    }
    
    public void calcularSegundos() {
        segundos = horas * 3600;
    }
    
    public void calcularDias() {
        dias =  horas / 24;
    }
    
    public double obtenerHoras() {
        return horas;
    }
    
    public double obtenerMinutos() {
        return minutos;
    }
    
    public double obtenerSegundos() {
        return segundos;
    }
    
    public double obtenerDias() {
        return dias;
    }
    

    
}
