
package paquete002;

public class EquivalenteHora {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
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
