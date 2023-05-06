/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author giann
 */
public class Evaluacion {
    private String examen;
    private int nota;

    public Evaluacion(String examen) {
        this.examen = examen;
        //this.nota = nota;
    }       

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return examen + ", nota=" + nota + '}';
    }
    
}
