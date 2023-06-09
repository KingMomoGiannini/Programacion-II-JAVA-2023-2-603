package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Servicio implements Facturable {

    private int cantHoras;

    public Servicio(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    
    public abstract double getVALOR_HORA();
    
    public double getPrecio(){
        
        return cantHoras * getVALOR_HORA();
    }
    
    @Override
    public double montoDeFacturacion(){
        return Matematica.sumarPorcentaje(getPrecio(),IVA/2);
    }


}