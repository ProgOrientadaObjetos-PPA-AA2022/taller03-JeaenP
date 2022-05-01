package paquete001;
import paquete002.EquivalenteHora;

public class Ejecutor {

    
    public static void main(String[] args) {
        EquivalenteHora h1= new EquivalenteHora();
        EquivalenteHora h2 = new EquivalenteHora();

        h1.establcerHora(100.4);
        h1.calcularMinutos();
        h1.calcularSegundos();
        h1.calcularDias();
        
        h2.establcerHora(46.92);
        h2.calcularMinutos();
        h2.calcularSegundos();
        h2.calcularDias();
        
        System.out.printf("Equivalencia Horas 1\n\nHoras: %s\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n",
                h1.obtenerHoras(),
                h1.obtenerMinutos(),
                h1.obtenerSegundos(), 
                h1.obtenerDias() );
        
        System.out.printf("Equivalencia Horas 1\n\nHoras: %s\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n ",
                h2.obtenerHoras(),
                h2.obtenerMinutos(),
                h2.obtenerSegundos(), 
                h2.obtenerDias() );
        
    }
    
}
