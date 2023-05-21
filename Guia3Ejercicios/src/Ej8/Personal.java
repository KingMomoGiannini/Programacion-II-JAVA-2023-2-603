/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

/**
 *
 * @author giann
 */
public abstract class Personal {
    
    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Personal(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }
    
    
    
    public abstract void mostrarSalarios();
    
}
