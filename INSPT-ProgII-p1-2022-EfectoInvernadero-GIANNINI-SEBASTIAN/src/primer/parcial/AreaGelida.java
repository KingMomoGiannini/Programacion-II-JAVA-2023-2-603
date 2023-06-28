package primer.parcial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class AreaGelida extends Area {

    private double porcTerritorioCongelado;

    public AreaGelida(double porcTerritorioCongelado, int extension, double elevacion) {
        super(extension, elevacion);
        this.porcTerritorioCongelado = porcTerritorioCongelado;
    }
    
    @Override
    public boolean estaEnPeligro() {
        boolean peligro = false;
        if (super.temPromedio()<-10 && porcTerritorioCongelado>90) {
            peligro = true;
        }
        return peligro;
    }

}