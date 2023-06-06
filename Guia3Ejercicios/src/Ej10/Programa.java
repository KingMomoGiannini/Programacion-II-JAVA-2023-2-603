package Ej10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Programa implements Calificables {

    private String id;
    private String nombre;
    private String nombreResponsable;
    private boolean flag;
    private ArrayList<Fuente> fuentes;

    public Programa(String id, String nombre, String nombreResponsable, boolean flag) {
        this.id = id;
        this.nombre = nombre;
        this.nombreResponsable = nombreResponsable;
        this.flag = flag;
        fuentes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }
    
    
    
    public void agregarFuentes(Fuente fuente,Fuente fuente1){
        if (fuente != null && fuente1 != null) {
            fuentes.add(fuente);
            fuentes.add(fuente1);
        }
    }
    
    public double promedioIndiceFuentes(){
        double elIndice = 0;
        for (Fuente fuente : fuentes) {
            elIndice += fuente.indiceCalidad();
        }
        return elIndice/fuentes.size();
    }

    @Override
    public double indiceCalidad() {
        double indice = 0;
        if (flag){
            indice = promedioIndiceFuentes();
        }
        return indice;
    }

    public double getIndiceFuenteMarcado() {
        double indice = 0;
        for (Fuente fuente : fuentes) {
            if (fuente instanceof LenguajeDeMarcado) {
                indice = ((LenguajeDeMarcado) fuente).indiceCalidad();
            }
        }
        return indice;
    }
    
    public double getIndiceFuenteProgram(){
        double indice = 0;
        for (Fuente fuente : fuentes) {
            if (fuente instanceof LenguajeDeProgramacion) {
                indice = ((LenguajeDeProgramacion) fuente).indiceCalidad();
            }
        }
        return indice;
    }
    
  
    //Item D
    public void mostrarDetalleDeMetodo(String nombreMetodo) {
        Metodo met = null;
        for (Fuente fuente : fuentes) {
            if (fuente instanceof LenguajeDeProgramacion) {
                met = ((LenguajeDeProgramacion) fuente).getMetodo(nombreMetodo);
            }
        }
        if (met != null) {
            System.out.println(met);
        }
        else{
            System.out.println("Error: el metodo ingresado no existe en este programa.");
        }
        
    }
    
    
    //Item E
    public void listadoFuentesMayoresAlPromedio() {
        // Método a resolver...
    }

    @Override
    public String toString() {
        return  "-------\nID del Programa = " + id 
                + ",\nNombre del programa = " + nombre 
                + "\nIndice de calidad = " + indiceCalidad() + "\n" ;
    }

    
    

}