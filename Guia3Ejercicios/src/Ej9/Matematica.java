/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej9;

/**
 *
 * @author giann
 */
public class Matematica {
    
    public static double sumarPorcentaje(double precio,double porcentaje){//Es estático, pero podemos utilizarlo
        double precioTotal = precio + precio*(porcentaje/100);
        return precioTotal;
    }
    
}
