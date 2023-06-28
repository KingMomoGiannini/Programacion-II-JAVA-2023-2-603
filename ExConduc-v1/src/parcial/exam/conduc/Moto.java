package parcial.exam.conduc;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Moto extends Vehiculo {

    private boolean espejos;

    public Moto(boolean espejos, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.espejos = espejos;
    }
    
}