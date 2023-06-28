package parcial.exam.conduc;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Auto extends Vehiculo {

    private int cantPuertas;

    public Auto(int cantPuertas, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.cantPuertas = cantPuertas;
    }

}