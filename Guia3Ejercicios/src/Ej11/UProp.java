package Ej11;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class UProp {

    private ArrayList<Inmobiliaria> inmobiliarias;
    
    public void listarInmobiliarias(Inmobiliaria inmo){
        if (inmo != null) {
            inmobiliarias.add(inmo);
        }
    }
    
}