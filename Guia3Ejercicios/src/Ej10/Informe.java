/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej10;

/**
 *
 * @author giann
 */
public class Informe {
    double inPrograma;
    double inLProgra;
    double inLMarc;
    String IDprog;

    public Informe(double inPrograma, double inLProgra, double inLMarc,String IDprog) {
        this.inPrograma = inPrograma;
        this.inLProgra = inLProgra;
        this.inLMarc = inLMarc;
        this.IDprog = IDprog;
    }
    
    @Override
    public String toString() {
        return "********\nInforme:" +"\nID del Programa : " + IDprog
                + "\nIndice de calidad de Programa = " + inPrograma 
                + "\nIndice de calidad de fuente de Programacion = " + inLProgra 
                + "\nIndice de calidad de Fuente de Marcado = " + inLMarc; 
    }
    
    
    
}
