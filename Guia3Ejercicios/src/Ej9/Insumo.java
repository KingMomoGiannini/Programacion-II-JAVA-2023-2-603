package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Insumo implements Facturable {

    private String nombre;
    private double porcGanancia;
    private double precioLista;
    private tipoInsumo tipo;

    public Insumo(String nombre, double porcGanancia, double precioLista, tipoInsumo tipo) {
        
        this.nombre = nombre;
        this.porcGanancia = porcGanancia;
        this.precioLista = precioLista;
        this.tipo = tipo;
    }
    
    @Override
    public double montoDeFacturacion(){
        double monto = Matematica.sumarPorcentaje(precioLista, porcGanancia);
        return Matematica.sumarPorcentaje(monto,IVA);
    }

}