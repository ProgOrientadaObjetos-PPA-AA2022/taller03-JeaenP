/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;
import paquete002.Terreno;

public class Ejecutor {

    
    public static void main(String[] args) {
        Terreno terreno1 = new Terreno();
        Terreno terreno2 = new Terreno();
        
        terreno1.establecerAncho(100);
        terreno1.establecerLargo(50);
        terreno1.establecerValorMetroCuadrado(20);
        terreno1.calcularArea();
        terreno1.calcularCostoTerreno();
        
        terreno2.establecerAncho(70.23);
        terreno2.establecerLargo(56.34);
        terreno2.establecerValorMetroCuadrado(50);
        terreno2.calcularArea();
        terreno2.calcularCostoTerreno();
        
        System.out.printf("Terreno1\n\nAncho del Terreno: %s\n"
                + "Largo del Terreno: %.2f\nArea del Terreno: %.2f\n"
                + "Valor del Metro Cuadrado: %.2f\n" + "Costo del Terreno: "
                + "%.2f\n",
                terreno1.obtenerAncho(),
                terreno1.obtenerLargo(), terreno1.obtenerArea(),
                terreno1.obtenerValorMetroCuadrado(), 
                terreno1.obtenerCostoTerreno() );
        
        System.out.printf("\nTerreno2\n\nAncho del Terreno: %s\n"
                + "Largo del Terreno: %.2f\nArea del Terreno: %.2f\n"
                + "Valor del Metro Cuadrado: %.2f\n" 
                + "Costo del Terreno: %.2f\n", 
                terreno2.obtenerAncho(),
                terreno2.obtenerLargo(), 
                terreno2.obtenerArea(),
                terreno2.obtenerValorMetroCuadrado(), 
                terreno2.obtenerCostoTerreno() );
    }
    
}
