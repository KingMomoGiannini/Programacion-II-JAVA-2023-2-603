/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

/**
 *
 * @author giann
 */
public class Circunferencia extends Figura {
    private double radio;

    public Circunferencia(double radio, String color) {
        super(color);
        this.radio = radio;      
    }
    
    @Override
    public double area(){
        double area= Math.PI *(radio*radio);
        return area;
    }
    
    @Override
    public double perimetro(){
        double diametro = (2 * Math.PI)*radio;
        return diametro;
    }
    
    @Override
    public void mostrarInfoDefiguras(){
        System.out.println("\nCircunferencia");
        System.out.println("Color: " + super.getColor() + " - Area: " + area() + " - Perimetro: " + perimetro() );
    }
    
}
