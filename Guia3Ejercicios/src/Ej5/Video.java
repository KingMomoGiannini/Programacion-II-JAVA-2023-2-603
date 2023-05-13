/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author giann
 */
public class Video extends ArchivoMultimedia {
    
    private String resolucion;
    private FormatoVideo formato;
    
    public Video( int duracion, boolean reproduce,String nombre, double peso,boolean estado, String ubicacion,String resolucion, FormatoVideo formato) {
        super(duracion,reproduce,nombre,peso,ubicacion,estado);
        this.resolucion = resolucion;
        this.formato = formato;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        
        return "Video: resolucion: = " + resolucion + "\tFormato: " + formato;
    }
    
}
