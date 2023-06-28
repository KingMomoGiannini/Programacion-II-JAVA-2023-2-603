package primer.parcial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PuntoDeControl {

    private ArrayList<Area> areas;

    public PuntoDeControl() {
        areas = new ArrayList<>();
    }
    
    public void agregarArea(Area elArea){
        if (elArea != null) {
            areas.add(elArea);
        }
    }

}