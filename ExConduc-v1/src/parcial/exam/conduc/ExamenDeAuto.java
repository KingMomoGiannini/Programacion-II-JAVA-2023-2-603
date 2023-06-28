package parcial.exam.conduc;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ExamenDeAuto extends Examen {

    private Vehiculo infoAuto;
    private Circuito circuito;

    public ExamenDeAuto(Vehiculo infoAuto, Circuito circuito, String fecha, Persona persona) {
        super(fecha, persona);
        this.infoAuto = infoAuto;
        this.circuito = circuito;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    @Override
    public boolean aprueba() {
        boolean califica = false;
        if (circuito.getTiempo()<= 90) {
            califica = true;
        }
        return califica;
    }

    @Override
    public Vehiculo infoVehiculo() {
        return infoAuto;
    }

}