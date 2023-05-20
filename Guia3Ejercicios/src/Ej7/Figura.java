/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

/**
 *
 * @author giann
 */
public abstract class Figura {
    
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract double area();
    
    public abstract double perimetro();
    
    public abstract void mostrarInfoDefiguras();
    
    
    
}
