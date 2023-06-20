package Ej11;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class UProp {

    private ArrayList<Inmobiliaria> inmobiliarias;
    
    public UProp(){
        inmobiliarias = new ArrayList<>();
    }
    
    public void cambiarPrecioPropiedad(Inmueble propiedad,double nuevoPrecio){
        buscarPorInmobiliaria(propiedad).setPrecio(nuevoPrecio);
    }
    
    private Inmueble buscarPorInmobiliaria(Inmueble propiedad){
        Inmueble laPropiedad = null;
        for (Inmobiliaria inmobiliaria : inmobiliarias) {
            if (propiedad == inmobiliaria.getInmueble(propiedad)) {
                laPropiedad = propiedad;
            }
        }
        return laPropiedad;
    }
            
    public void listarInmobiliarias(Inmobiliaria inmo){
        if (inmo != null) {
            inmobiliarias.add(inmo);
        }
    }
    
}