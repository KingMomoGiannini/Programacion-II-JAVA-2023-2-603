package primer.parcial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class AreaTundraPolar extends Area {

    private double cantLlovidos;
    private IntensidadViento intensidad;

    public AreaTundraPolar(double cantLlovidos, IntensidadViento intensidad, int extension, double elevacion) {
        super(extension, elevacion);
        this.cantLlovidos = cantLlovidos;
        this.intensidad = intensidad;
    }
    
    public boolean intensidadFuerte(){
        boolean vientoFuerte;
        return vientoFuerte = IntensidadViento.FUERTE.equals(this.intensidad);
    }
    
    @Override
    public boolean estaEnPeligro() {
        boolean peligro = false;
        if (intensidadFuerte() && (super.temperaturaSuperior(8) && super.getElevacion() < 500)) {
            peligro = true;
        }
        return peligro;
    }

    

}