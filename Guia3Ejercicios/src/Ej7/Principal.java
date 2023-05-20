/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej7;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GrupoDeFiguras grupo = new GrupoDeFiguras(); 
        
        Figura f = new Circunferencia(10,"Verde");
        Figura f1 = new Rectangulo (5,1,"Rojo");
        Figura f2 = new TrianguloEquilatero(3,5,"Amarillo");
        Figura f3 = new Circunferencia(5,"Violeta");
        
        grupo.agregarFiguras(f);
        grupo.agregarFiguras(f1);
        grupo.agregarFiguras(f2);
        grupo.agregarFiguras(f3);

        grupo.mostrarInfoDefiguras();
    }
    
}
