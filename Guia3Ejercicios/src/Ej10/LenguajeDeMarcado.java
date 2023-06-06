package Ej10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class LenguajeDeMarcado extends Fuente implements Calificables {

    private double tamanioArchivo;

    public LenguajeDeMarcado(double tamanioArchivo, String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.tamanioArchivo = tamanioArchivo;
    }

    

    @Override
    public double indiceCalidad() {
        return 450/tamanioArchivo;
    }

}