/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Computadora {
    
    private ArrayList<Archivo> a;
    

    public Computadora() {
        a = new ArrayList<>();
    }
    
    public void crearArchivos(Archivo archivo){
        if (archivo != null) {
            a.add(archivo);
        }
    }
    
    public void cerrarTodos (){
    
    }
    
    public int cantArchivosDeTexto(){
    
        return 0;
    }
    
    public void cifrarArchivos(){
    
    }
    
    public int duracionPromedio(){
    
        return 0;
    }
    
    public ArrayList<Archivo> videosFullHD(){
    
        return null;
    }
    
}
