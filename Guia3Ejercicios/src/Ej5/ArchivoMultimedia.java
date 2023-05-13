/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author giann
 */
public class ArchivoMultimedia extends Archivo {
    
    private int duracion;
    private boolean reproduce;

    public ArchivoMultimedia(int duracion, boolean reproduce,String nombre, double peso, String ubicacion,boolean estado) {
        super(nombre,peso,ubicacion,estado);
        this.duracion = duracion;
        this.reproduce = reproduce;
    }
    
    public void reproducirPausar(boolean playPause){
        if (playPause) {
            this.reproduce= !playPause;
        }
    }

    public int getDuracion() {
        return duracion;
    }
    
    
    
}
