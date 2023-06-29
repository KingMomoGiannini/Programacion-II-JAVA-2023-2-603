/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

/**
 *
 * @author giann
 */
public class Pelicula {
    
    private String nombre;
    private boolean premium;

    public Pelicula(String nombre, boolean premium) {
        this.nombre = nombre;
        this.premium = premium;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isPremium() {
        return premium;
    }
    
    
}
