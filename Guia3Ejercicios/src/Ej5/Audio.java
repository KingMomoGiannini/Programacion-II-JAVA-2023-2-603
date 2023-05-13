/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author giann
 */
public class Audio extends ArchivoMultimedia {
    
    private String artista;
    private String album;
    private FormatoAudio formato;

    public Audio( int duracion, boolean reproduce,String nombre, double peso, String ubicacion,boolean estado,String artista, String album, FormatoAudio formato) {
        super(duracion,reproduce,nombre,peso,ubicacion,estado);
        this.artista = artista;
        this.album = album;
        this.formato = formato;
    }
    
    
    
}
