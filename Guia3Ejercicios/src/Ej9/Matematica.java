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
        double precioTotal = 0;                                           //en un metodo publico.      
        if (precio > 0 && porcentaje > 0) {
            precioTotal = precio + precio*(porcentaje/100);
        }
        return precioTotal;
    }
    
    public double IVA(double precio){ //Para calcular el IVA de cualquier costo ingresado.
        double elIVA = 0;
        if (precio > 0) {
            elIVA = precio *0.21;
        }
        return elIVA;
    }
    
    public double costoServicio(double costo){//Lo usamos para calcular el costo del servicio de reparacion
        return sumarPorcentaje(costo,25);     //cuando la dificultad excede los 3 puntos.
    }
    
    public double costoInsumo(double costo, double porcentaje){//Lo usamos para calcular el costo del insumo en cuestion
        return sumarPorcentaje(costo,porcentaje);     
    }
    
    
}
