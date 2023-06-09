package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioArmado extends Servicio {

    private static final double VALOR_HORA = 250;

    public ServicioArmado(int cantHoras) {
        super(cantHoras);
    }

    @Override
    public double getVALOR_HORA() {
        return VALOR_HORA;
    }
    
}