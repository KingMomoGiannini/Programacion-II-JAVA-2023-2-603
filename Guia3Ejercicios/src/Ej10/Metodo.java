package Ej10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Metodo implements Calificables {

    private String nombre;
    private int cantParametros;
    private int cantInstrucciones;
    private int cantRamificaciones;

    public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamificaciones) {
        this.nombre = nombre;
        this.cantParametros = cantParametros;
        this.cantInstrucciones = cantInstrucciones;
        this.cantRamificaciones = cantRamificaciones;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public double indiceCalidad() {
        return (5/(cantParametros+1)) + (20/(cantInstrucciones+3)+3/(cantRamificaciones+1));
    }

    @Override
    public String toString() {
        return "-----------\nNombre del Metodo = " 
                + nombre + "\nCantidad de Parametros = " + cantParametros 
                + "\nCantidad de Instrucciones = " + cantInstrucciones 
                + "\nCantidad de Ramificaciones = " + cantRamificaciones 
                + "\nIndice de calidad = " + indiceCalidad()+"\n-----------";
    }

    
    
}