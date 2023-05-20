/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class GrupoDeFiguras {
    
    ArrayList<Figura> figuras;

    public GrupoDeFiguras() {
        
        figuras = new ArrayList<>();
        
    }
    
    public void agregarFiguras(Figura f){
        if (f != null) {
            figuras.add(f);
        }
    }
    
    public void mostrarInfoDefiguras(){
        if (figuras != null) {
            for (Figura f : figuras) {
                f.mostrarInfoDefiguras();
            }
        }
    }
    
}
