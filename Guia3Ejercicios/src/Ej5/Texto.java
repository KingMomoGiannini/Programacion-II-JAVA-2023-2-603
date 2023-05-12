/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author giann
 */
public class Texto extends Archivo {
    
    private String codificacion;

    public Texto(String nombre, double peso, String ubicacion,boolean estado,String codificacion) {
        super(nombre, peso, ubicacion);
        this.codificacion = codificacion;
    }
    
    
}
