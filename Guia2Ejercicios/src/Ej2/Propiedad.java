/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author giann
 */
public class Propiedad {
    
    private String domicilio;
    private double precio;
    private TipoPropiedad tipoDePropiedad;

    public Propiedad(String domicilio, double precio, TipoPropiedad tipoDePropiedad) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.tipoDePropiedad = tipoDePropiedad;
    }

//    public String getDomicilio() {
//        return domicilio;
//    }

    public double getPrecio() {
        return precio;
    }

    public TipoPropiedad getTipoDePropiedad() {
        return tipoDePropiedad;
    }

    @Override
    public String toString() {
        return "\nPropiedad {" + "domicilio=" + domicilio + ", precio=" + precio + ", tipoDePropiedad=" + tipoDePropiedad + "}";
    }
    
    
    
    
}
