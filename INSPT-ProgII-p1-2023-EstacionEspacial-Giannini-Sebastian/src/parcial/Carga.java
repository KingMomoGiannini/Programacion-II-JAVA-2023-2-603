package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Carga {

    private String detalle;
    private double volumen;

    public Carga(String detalle, double volumen) {
        this.detalle = detalle;
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return "Carga: " + detalle + "\t" + volumen + "m3";
    }
    
}