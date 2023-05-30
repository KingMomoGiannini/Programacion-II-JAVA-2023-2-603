package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Servicio extends Facturable {

    private int cantHoras;

    public Servicio(int cantHoras, Matematica calculo) {
        super(calculo);
        this.cantHoras = cantHoras;
    }
    
    @Override
    public Matematica getCalculo() {
        return super.getCalculo();
    }

    public int getCantHoras() {
        return cantHoras;
    }

    
    @Override
    public abstract double montoDeFacturacion();


}