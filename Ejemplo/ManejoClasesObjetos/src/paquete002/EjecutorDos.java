/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.FacturaTelefono;

/**
 *
 * @author SALA I
 */
public class EjecutorDos {
    public static void main(String[] args) {
        FacturaTelefono telefono = new FacturaTelefono();
        
        telefono.establecerNumeroTelefono("0960139074");
        telefono.establecerMinutosMes(100);
        telefono.establecerValorMinuto(0.40);
        
        telefono.calcularValorFactura();
        
        System.out.printf("Factura de Teléfono\n\n\tNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\n\tValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
                telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
                telefono.obtenerValorFactura());
    }
}
