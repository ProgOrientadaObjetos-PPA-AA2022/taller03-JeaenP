
package paquete001;
import paquete002.DispositivoElectronico;

public class Ejecutor {

    public static void main(String[] args) {
        DispositivoElectronico de = new DispositivoElectronico();
        DispositivoElectronico de2 = new DispositivoElectronico();
        
        de.establecerSistemaOperativo("Windows");
        de.establecerTamanioPantalla("15.6");
        de.establecerCostoInicial(500.50);
        de.establecerIvaPorcetanje(12);
        de.establecerDireccionMac("00:1e:c2:9e:28:6b");
        de.establecerInformacionImei("010928/00/389023/3");
        de.calcularIva();
        de.calcularCostoFinal();
        
        de2.establecerSistemaOperativo("MAC");
        de2.establecerTamanioPantalla("17.1");
        de2.establecerCostoInicial(1200.50);
        de2.establecerIvaPorcetanje(12);
        de2.establecerDireccionMac("00:1g:c2:9y:28:6b");
        de2.establecerInformacionImei("0136728/00/899023/3");
        de2.calcularIva();
        de2.calcularCostoFinal();
        
        
        System.out.printf("\nDispositivo Electronico 2\n\nSistema Operativo: %s\n"
                + "Direccion MAC: %s\n"
                + "Informacion IMEI: %s\n"
                + "Tamaño Pantalla: %s\nCosto Inicial: %.2f\n"
                + "IVA (Porcentaje): %.2f\n"
                + "IVA: %.2f\n"
                + "Costo final: %.2f\n",
                de.obtenerSistemaOperativo(),
                de.obtenerDireccionMac(),
                de.obtenerInformacionImei(),
                de.obtenerTamanioPantalla(), 
                de.obtenerCostoInicial(), 
                de.obtenerIvaPorcentaje(), 
                de.obtenerIva(), 
                de.obtenerCostoFinal() );
        
        System.out.printf("Dispositivo Electronico 1\n\nSistema Operativo: %s\n"
                + "Direccion MAC: %s\n"
                + "Informacion IMEI: %s\n"
                + "Tamaño Pantalla: %s\nCosto Inicial: %.2f\n"
                + "IVA (Porcentaje): %.2f\n"
                + "IVA: %.2f\n"
                + "Costo final: %.2f\n",
                de2.obtenerSistemaOperativo(),
                de2.obtenerDireccionMac(),
                de2.obtenerInformacionImei(),
                de2.obtenerTamanioPantalla(), 
                de2.obtenerCostoInicial(), 
                de2.obtenerIvaPorcentaje(), 
                de2.obtenerIva(), 
                de2.obtenerCostoFinal() );
        
    }
    
}
