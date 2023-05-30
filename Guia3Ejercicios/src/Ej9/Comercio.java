package Ej9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Comercio {

    private ArrayList<Facturable> operaciones;

    public Comercio() {
        operaciones = new ArrayList<>();
    }
    
    public void factura(Facturable operacion) {
        if (operacion != null ) {
            operaciones.add(operacion);
        }
    }
    
    public double montoTotalFacturado(){
        double montoTotal = 0;
        for (Facturable operacion : operaciones) {
            montoTotal += operacion.montoDeFacturacion();
        }
        return montoTotal;
    }
    
    public boolean servicioSimple(Facturable operacion){
        boolean simple = false;
        if (((ServicioReparacion) operacion).reparacionSencilla()) {
            simple = true;
        }
        return simple;
    }
    
    public int cantServiciosSimples() {
        int cant = 0;
        for (Facturable operacion : operaciones) {
            if (operacion instanceof ServicioReparacion && servicioSimple(operacion)) {
                cant++;
            }
        }
        return cant;
    }

}