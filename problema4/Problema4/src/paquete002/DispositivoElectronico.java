
package paquete002;


public class DispositivoElectronico {
    private String sistemaOperativo;
    private String tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double iva;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    
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
        iva = costoInicial * ivaPorcentaje / 100;
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + iva;
    }

    public void establecerDireccionMac(String x) {
        direccionMac = x;
    }

    public void establecerInformacionImei(String x) {
        informacionImei = x;
    }
    
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public String obtenerTamanioPantalla() {
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial() {
        return costoInicial;
    }
    
    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }
    
    public double obtenerIva() {
        return iva;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public String obtenerDireccionMac() {
        return direccionMac;
    }
    
    public String obtenerInformacionImei() {
        return informacionImei;
    }
}
