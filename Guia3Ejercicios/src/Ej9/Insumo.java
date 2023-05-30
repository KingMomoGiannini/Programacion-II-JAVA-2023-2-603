package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Insumo extends Facturable {

    private String nombre;
    private double porcGanancia;
    private double precioLista;
    private tipoInsumo tipo;

    public Insumo(String nombre, double porcGanancia, double precioLista, tipoInsumo tipo, Matematica calculo) {
        super(calculo);
        this.nombre = nombre;
        this.porcGanancia = porcGanancia;
        this.precioLista = precioLista;
        this.tipo = tipo;
    }
    
    public double costoDelInsumo(){
        return super.getCalculo().costoInsumo(precioLista, porcGanancia);
    }
    
    public double IVADelInsumo(){
        return super.getCalculo().IVA(precioLista);
    }
    
    @Override
    public double montoDeFacturacion(){
        return costoDelInsumo() + IVADelInsumo();
    }

}