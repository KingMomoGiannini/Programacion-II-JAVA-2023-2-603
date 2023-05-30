package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioArmado extends Servicio {

    private static final double VALOR_HORA = 250;

    public ServicioArmado(int cantHoras, Matematica calculo) {
        super(cantHoras, calculo);
    }
    
    @Override
    public double montoDeFacturacion(){
        double costoTotal = VALOR_HORA * super.getCantHoras()   ;
        costoTotal += super.getCalculo().IVA(costoTotal)/2;
        return costoTotal;
    }
    
}