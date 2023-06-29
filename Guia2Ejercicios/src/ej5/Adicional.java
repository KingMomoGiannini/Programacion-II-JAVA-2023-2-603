package ej5;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Adicional {

    private double precio;
    private String fechaPrestacion;
    private TipoPrestacion tipo;

    public Adicional(double precio, String fechaPrestacion, TipoPrestacion tipo) {
        this.precio = precio;
        this.fechaPrestacion = fechaPrestacion;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }
    

}