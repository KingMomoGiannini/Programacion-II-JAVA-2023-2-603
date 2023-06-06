package Ej10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class LenguajeDeProgramacion extends Fuente implements Calificables {

    private ArrayList<Metodo> metodos;

    public LenguajeDeProgramacion(String nombre, String ubicacion) {
        super(nombre, ubicacion);
        metodos = new ArrayList<>();
    }
    
    public void agregarMetodos(Metodo m){
        if (m != null) {
            metodos.add(m);
        }
    }
    
    public Metodo getMetodo(String nombre){
        Metodo elMetodo = null;
        for (Metodo metodo : metodos) {
            if (metodo.getNombre().equals(nombre)) {
                elMetodo = metodo;
            }
        }
        return elMetodo;
    }
    
    public int cantMetodos(){
        return metodos.size();
    }
    
    @Override
    public double indiceCalidad() {
        double sumaDeIndices = 0;
        for (Metodo metodo : metodos) {
            sumaDeIndices += metodo.indiceCalidad();
        }
        return sumaDeIndices/cantMetodos();
    }
    
    
    
}