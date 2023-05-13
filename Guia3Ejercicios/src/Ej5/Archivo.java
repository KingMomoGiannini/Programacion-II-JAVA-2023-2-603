/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author giann
 */
public class Archivo {
    
    private String nombre;
    private double peso;
    private String ubicacion;
    private boolean estado;

    public Archivo(String nombre, double peso, String ubicacion, boolean estado) {
        this.nombre = nombre;
        this.peso = peso;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
}
