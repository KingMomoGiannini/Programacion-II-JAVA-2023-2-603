package primer.parcial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Area implements Monitoreable {

    private int extension;
    private double elevacion;
    private ArrayList<Double> tempMedias;

    public Area(int extension, double elevacion) {
        this.extension = extension;
        this.elevacion = elevacion;
        tempMedias = new ArrayList<>();
    }

    public int getExtension() {
        return extension;
    }

    public double getElevacion() {
        return elevacion;
    }
    
    public double temPromedio(){
        double sumTemperaturas = 0;
        if (!tempMedias.isEmpty()) {
            for (Double tempMedia : tempMedias) {
                sumTemperaturas += tempMedia;
            }
        }
        return sumTemperaturas / tempMedias.size();
    }
    
    public boolean temperaturaSuperior(double tempUmbral){
        boolean superaTemperatura = false;
        if (!tempMedias.isEmpty()) {
            for (Double tempMedia : tempMedias) {
                if (tempMedia > tempUmbral) {
                    superaTemperatura = true;
                }
            }
        }
        return superaTemperatura;
    }
    
    @Override
    public abstract boolean estaEnPeligro();
    
    

}