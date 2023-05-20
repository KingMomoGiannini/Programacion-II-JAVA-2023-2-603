/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

/**
 *
 * @author giann
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        double area = base * altura;
        return area;
    }
    
    @Override
    public double perimetro(){
        double perimetro = base*2 + altura*2;
        return perimetro;
    }
    
    @Override
    public void mostrarInfoDefiguras(){
        System.out.println("\nRectangulo");
        System.out.println("Color: " + super.getColor() + " - Area: " + area() + " - Perimetro: " + perimetro() );
    }

}
