package primer.parcial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class AreaTundra extends Area {

    private double cantLlovidos;

    public AreaTundra(double cantLlovidos, int extension, double elevacion) {
        super(extension, elevacion);
        this.cantLlovidos = cantLlovidos;
    }
    
    @Override
    public boolean estaEnPeligro() {
        boolean peligro = false;
        if (super.temperaturaSuperior(10) && super.getElevacion() < 500) {
            peligro = true;
        }
        return peligro;
    }

}