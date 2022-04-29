/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;


public class DispositivoElectronico {
    String sistemaOperativo;
    String tamanioPantalla;
    double costoInicial;
    double ivaPorcentaje;
    double iva;
    double costoFinal;
    String direccionMac;
    String informacionImei;
    
    public void establecerSistemaOperativo(String x) {
        sistemaOperativo = x;
    }

    public void establecerTamanioPantalla(String x) {
        tamanioPantalla = x;
    }

    public void establecerCostoInicial(double x) {
        costoInicial = x;
    }
    
    public void establecerIvaPorcetanje(double x) {
        ivaPorcentaje = x;
    }

    public void calcularIva() {
        iva = costoInicial * ivaPorcentaje;
    }

    public void calcularCostoFinal(double x) {

    }

    public void establecerDireccionMac(String x) {

    }

    public void establecerInformacionImei(String x) {

    }
}
