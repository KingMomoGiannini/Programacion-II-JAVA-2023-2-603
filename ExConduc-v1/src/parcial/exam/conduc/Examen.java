package parcial.exam.conduc;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Examen implements Evaluable {

    private String fecha;
    private Persona persona;

    public Examen(String fecha, Persona persona) {
        this.fecha = fecha;
        this.persona = persona;
    }
    
    @Override
    public abstract boolean aprueba();

    public abstract Vehiculo infoVehiculo();

}