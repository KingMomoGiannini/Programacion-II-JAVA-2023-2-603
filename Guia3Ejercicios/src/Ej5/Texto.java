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
    private boolean cifrado = false;

    public Texto(String nombre, double peso, String ubicacion,boolean estado,String codificacion,boolean cifrado) {
        super(nombre, peso, ubicacion, estado);
        this.codificacion = codificacion;
        this.cifrado = cifrado;
    }

    public void setCifrado(boolean cifrado) {
        this.cifrado = cifrado;
    }

    public boolean isCifrado() {
        return cifrado;
    }
    
    public String getCodificacion() {
        return codificacion;
    }
    
    
}
