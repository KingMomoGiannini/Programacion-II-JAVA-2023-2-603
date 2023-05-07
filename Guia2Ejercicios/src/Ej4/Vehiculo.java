/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

/**
 *
 * @author giann
 */
public class Vehiculo {
    
    private String patente;
    private double precio;
    private TipoVehiculo tipoDeVehiculo;

    public Vehiculo(String patente, double precio, TipoVehiculo tipoDeVehiculo) {
        this.patente = patente;
        this.precio = precio;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public TipoVehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public String getPatente() {
        return patente;
    }
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "Patente = " + patente + ", precio = $" + precio + '}'+"\n";
    }
    
    
    
}
